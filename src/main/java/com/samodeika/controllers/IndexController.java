package com.samodeika.controllers;

import com.samodeika.entities.ShowTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("getTime")
    String getTime(Model model) {
        model.addAttribute("time", ShowTime.getInstance());
        return "fragments/showtime";
    }

}
