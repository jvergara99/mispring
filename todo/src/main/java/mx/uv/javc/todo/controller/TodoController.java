package mx.uv.javc.todo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.uv.javc.todo.model.Todo;

@RestController
public class TodoController {

    private List<Todo> todos;

    public TodoController() {
        todos = new LinkedList<>();

        todos.add(new Todo(1, "Primera tarea", "Proyecto Spring", false));
    }
    
    // Obtener todas tareas
    @RequestMapping("/obtenerTodos")
    public List<Todo> getAll() {
        return todos;
    }

    // Crear una nueva tarea

}
