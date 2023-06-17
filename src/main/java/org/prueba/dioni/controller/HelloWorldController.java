package org.prueba.dioni.controller;

import org.prueba.dioni.service.NamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {
    @Autowired
    NamesService namesService;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world!";
    }

    @GetMapping("/hello/{myName}")
    public String helloName(@PathVariable(name = "myName") String name) {
        return "Hello " + name;
    }

    @GetMapping("/names")
    public List<String> getNames() {
        return namesService.obtenerNombres();
    }
}
