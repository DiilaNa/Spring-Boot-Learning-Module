package lk.ijse.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
*/
@Controller
@RequestMapping("hello")
public class HelloController {

    public HelloController() {
        System.out.println("HelloController");
    }
    @GetMapping
    public String hello() {
       return "index";
    }
    @GetMapping("customer")
    public String index() {
        return "customer";
    }
    @GetMapping("index")
    public String hello1() {
        return "index";
    }
/*    @GetMapping("one")
    public String test01(){
        return "test 01";
    }
    @GetMapping("two")
    public String test02(){
        return "test 02";
    }*/

}
