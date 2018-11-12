package Com.GreenFox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    String[] fontColors = {"red", "blue", "green", "yellow", "orange", "dark", "lavender", "cyan", "maroon", "navy", "chocolate"};

    Random random = new Random();

    @GetMapping("/web/greeting")
    public String greeting(Model model) {
        int counter = random.nextInt(hellos.length);
        int counterColor = random.nextInt(fontColors.length);
        int sizeFont = random.nextInt(250);
        model.addAttribute("hellos", hellos[counter]);
        model.addAttribute("fontColors", fontColors[counterColor]);
        model.addAttribute("sizeFont", sizeFont);
        return "greeting";
    }
}
