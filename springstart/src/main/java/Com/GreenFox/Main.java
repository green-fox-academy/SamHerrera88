package Com.GreenFox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class);

    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "Hola Mundo";
    }

}