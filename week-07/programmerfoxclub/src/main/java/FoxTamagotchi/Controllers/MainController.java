package FoxTamagotchi.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String getMainPage(Model model){
        return "index";
    }
    @GetMapping("/login")
    public String renderLoginPage(){
        return "login";
    }
    @PostMapping("/login")
    public String getLoginName(@RequestParam(value = "foxname") String foxname, Model model){
        model.addAttribute("fox",foxname);
        return "redirect:/" + foxname;
    }
}
