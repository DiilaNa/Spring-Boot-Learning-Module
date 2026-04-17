package lk.ijse.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("char")
public class CharacterMappingController {

    @GetMapping("item/I???")
    public String sayHello() {
        return "Say Hello";
    }

    @GetMapping("????/search")
    public String Hello() {
        return "Say Hello Mchn";
    }
}
