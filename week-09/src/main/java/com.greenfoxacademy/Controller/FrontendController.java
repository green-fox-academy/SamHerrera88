package com.greenfoxacademy.Controller;

import com.greenfoxacademy.Model.DoublingJS;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontendController {


    private DoublingJS getValueDoubled;

    @GetMapping("/")
    public String FrontendController(){
        return "index";
    }

    }
