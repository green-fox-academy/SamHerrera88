package com.greenfoxacademy.Controller;

import com.greenfoxacademy.Model.DoublingJS;
import com.greenfoxacademy.Model.Greeter;
import com.greenfoxacademy.Service.ErrorMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/doubling")
    public Object getValueDoubled(@RequestParam(value = "input", required = false)Integer getResult) {
        if (getResult != null) {
            return new DoublingJS(getResult);
        } else {
            return new ErrorMessage("Please provide an input!");

        }
    }
    @GetMapping("/greeter")
    public Object getGreeting(@RequestParam(value = "name",required = false) String name,
                              @RequestParam(value = "title",required = false) String title){
        if (name == null || title == null){
            return new ErrorMessage("Please provide a name!");
        } else{
            return new Greeter(name, title);
        }
    }
}

