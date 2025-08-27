package com.demo.hotel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//mubashira
@Controller
public class HomeController {

    @GetMapping("/")
    public String getSearchPage() {
        return "/hotel/search";
    }

    @GetMapping("/test")
    public String test() {
        return "/hotel/test";
    }
}
