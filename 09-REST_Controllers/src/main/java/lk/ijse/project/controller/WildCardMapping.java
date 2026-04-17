package lk.ijse.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wild")
public class WildCardMapping {

    /*wild/test/abc/hello - work*/
    /*wild/test/abc123/hello - work*/
    /*wild/test/ad/de -  work*/

    /*wild/test//hello - Not work*/
    /*wild/test/123/hello - Not work*/
    /*wild/test/abc123/de/hello - Not work*/
    @GetMapping("/test/*/hello")
    public String getWildCard() {
        return "WildCard Mapping";
    }

    @GetMapping("/test/*/*")
    public String getWildCard2() {
        return "WildCard Mapping 02";
    }
}
