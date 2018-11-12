package FoxTamagotchi.Controllers;

import FoxTamagotchi.Model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
        List<Fox> foxes = new ArrayList<>();

    @GetMapping("/")
    public String getMainPage(Model model){
        return "index";
    }
    @GetMapping("/login")
    public String renderLoginPage(){
        return "login";
    }
    @PostMapping("/login")
    public String getLoginName(@RequestParam String foxname, Model model){
        model.addAttribute("fox",foxname);
        return "redirect:/index/" + foxname;
    }
    @GetMapping("/index/")
    public String mainPageWithoutName(Model model){
        model.addAttribute("name","No Parameters");
        return "login";
    }
    @GetMapping("/index/{foxname}")
    public String mainPage(Model model, @PathVariable String foxname){
        model.addAttribute("fox",foxname);
        return "index";
    }
}
