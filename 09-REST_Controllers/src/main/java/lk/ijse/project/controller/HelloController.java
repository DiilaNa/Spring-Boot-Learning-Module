package lk.ijse.project.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String getMapping(){
        return "GET";
    }
    @PostMapping(path = "postMapping")
    public String postMapping(){
        return "POST";
    }

    @PutMapping
    public String putMapping(){
        return "PUT";
    }

    @DeleteMapping
    public String deleteMapping(){
        return "DELETE";
    }

    @PatchMapping
    public String patchMapping(){
        return "PATCH";
    }
}
