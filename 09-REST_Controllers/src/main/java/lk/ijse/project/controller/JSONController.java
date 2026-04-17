package lk.ijse.project.controller;

import lk.ijse.project.dto.City;
import lk.ijse.project.dto.CityDTO;
import lk.ijse.project.dto.UserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping(value = "save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String postJson(@RequestBody UserDto userDto) {
        System.out.println(userDto);
        return "success";
    }

    @GetMapping(value = "get" , produces = MediaType.APPLICATION_JSON_VALUE)
    public CityDTO getUser(){
       CityDTO cityDTO = new CityDTO();
       cityDTO.setUserID("U001");
       cityDTO.setUserName("Dilan");
       cityDTO.setAddress("GAlle");

       City city = new City();
       city.setName("Panadura");
       city.setCode("RAI12530");

       cityDTO.setCity(city);

       return cityDTO;

    }
}
