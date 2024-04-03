package mx.uv.coatza.practica1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String helloKitty() {

        return "Hello Kitty";
    }

    @RequestMapping("/adios")
    public String goodBye() {

        return "Hasta la vista baby";
    }
    
}
