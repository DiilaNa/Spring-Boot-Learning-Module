package lk.ijse.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ExactMapping {
    @GetMapping
    public String exactMapping1() {
        return "Hello Exact Mapping 1";
    }

    @GetMapping(path = "exact02")
    public String exactMapping2() {
        return "Hello Exact Mapping 2";
    }

    @GetMapping(path = "exact03")
    public String exactMapping3() {
        return "Hello Exact Mapping 3";
    }

}
