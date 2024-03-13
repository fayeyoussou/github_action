package sn.youdev.github_action.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {
    @GetMapping
    public String sayHello(){
        return "Hello";
    }
    @GetMapping("/name/{name}")
    public String sayHello(@PathVariable final String name){
        return "Hello"+name;
    }
}
