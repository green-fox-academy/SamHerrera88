package BankApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

    @RequestMapping(value = "/show")
    public String bankaccount(Model model){
        model.addAttribute("name", )
        return "bankaccount";
    }
}