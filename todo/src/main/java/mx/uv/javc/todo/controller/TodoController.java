package mx.uv.javc.todo.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import mx.uv.javc.todo.dto.CreateTodoDTO;
import mx.uv.javc.todo.dto.TodoDTO;
import mx.uv.javc.todo.model.Todo;

@RestController
public class TodoController {

    private List<Todo> todos;
    private long currentId = 1l;

    public TodoController() {
        todos = new LinkedList<>();

        todos.add(new Todo(1, "Primera tarea", "Proyecto Spring", false));
    }
    
    // Obtener todas tareas
    @RequestMapping("/obtenerTodos")
    public List<TodoDTO> getAll() {

        List<TodoDTO> data = new LinkedList<>();

        for ( Todo model : todos) {
            TodoDTO dto = new TodoDTO();
            dto.setId(model.getId());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setCompleted(model.isCompleted());
            data.add(dto);
        }

        return data;
    }

    // Crear una nueva tarea
    @RequestMapping("/crearTodo")
    public TodoDTO create(@Valid @RequestBody CreateTodoDTO data) {

        // Conversión de DTO a model (model es cómo almaceno los datos)
        // DTO es cómo los recibo y cómo los regreso desde controlador

        Todo model = new Todo(++currentId, data.getTitle(), data.getDescription(), false);
        todos.add(model);

        TodoDTO dto = new TodoDTO();

        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setDescription(model.getDescription());
        dto.setCompleted(model.isCompleted());

        return dto;
    }

}
