package com.greenfoxacademy.Controller;

import com.greenfoxacademy.Model.*;
import com.greenfoxacademy.Service.ErrorMessage;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @GetMapping("/doubling")
    public Object getValueDoubled(@RequestParam(value = "input", required = false) Integer getResult) {
        if (getResult != null) {
            return new DoublingJS(getResult);
        } else {
            return new ErrorMessage("Please provide an input!");

        }
    }

    @GetMapping("/greeter")
    public Object getGreeting(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "title", required = false) String title) {
        if (name == null || title == null) {
            return new ErrorMessage("Please provide a name!");
        } else {
            return new Greeter(name, title);
        }
    }
    @GetMapping("/appenda/{appendable}")
    public Object getGreeting(@PathVariable String appendable){
        return new AppendA(appendable);
    }

    @PostMapping("/dountil/{what}")
    public Object doUntil(@PathVariable(value ="what") String what,@RequestBody DoUntilValue doUntilValue){
        if (doUntilValue.getUntil()==0){
            return new ErrorMessage("Parameter is required");
        } else {
            return new DoUntilSumAndFactor(what, doUntilValue.getUntil());
        }
    }
}


