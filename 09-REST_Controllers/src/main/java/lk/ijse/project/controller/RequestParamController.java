package lk.ijse.project.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("param")
public class RequestParamController {

    @GetMapping(params = "id")
    public String param01(@RequestParam("id") String id) {
        return "Received param: " + id;
    }

    @GetMapping(params = {"id","name"})
    public String param02(@RequestParam("id") String id, @RequestParam("name") String name) {
        return "Received param: " + id + " " + name;
    }

    @GetMapping(path = {"/{code}"}, params = {"id","name"})
    public String param03(@PathVariable("code") String code , @RequestParam("id") String id, @RequestParam("name") String name) {
        return "Received: " +code +"-" + id + "-" + name;
    }

}
