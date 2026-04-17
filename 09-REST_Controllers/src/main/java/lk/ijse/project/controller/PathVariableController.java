package lk.ijse.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("path")
public class PathVariableController {

    /*path/id123*/
    @GetMapping(path = "{id}")
    public String path(@PathVariable("id") String idName) {
        return idName;
    }
    /*path/Dilan/23*/
    @GetMapping(path = "{name}/{age}")
    public String path(@PathVariable("name") String VName, @PathVariable("age") String VAge) {
        return VName + " - " + VAge;
    }

    @GetMapping(path = "customer/{id:[I][0-9]{3}}")
    public String path2(@PathVariable("id") String id){
        return "hello" + id ;
    }

    /*path/item/I001/branch/Horana*/
    @GetMapping(path = "item/{code}/branch/{city}")
    public String path3(){
        return "hello07" ;
    }

    @GetMapping(path ="item/{code:[I][0-9]{3}]}/branch/{city}" )
    public String path4(@PathVariable("code") String code, @PathVariable("city") String city){
        return "CODE " + code + " - " +"CITY "+ city ;
    }
}
