package lk.ijse.project.controller;

import jakarta.servlet.annotation.MultipartConfig;
import lk.ijse.project.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("form")
public class FormController {

    @PostMapping("save")
    public String sayPost(@ModelAttribute UserDto userDto) {
      /*  for (Map.Entry<String, String> entry : formData.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return "save User";*/
        System.out.println(userDto);
        return "success save User";
    }
}
