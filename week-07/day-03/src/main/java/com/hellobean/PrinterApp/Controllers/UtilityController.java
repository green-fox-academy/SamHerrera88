package Com.hellobean.PrinterApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {


    @GetMapping("/useful")
    public String mainPage(){
        return "useful";
    }
    @GetMapping("/useful/colored")
    public String coloredBackground(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }
}
