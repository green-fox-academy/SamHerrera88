package BankApp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
@Controller
public class BankOfSimbaApp {

    public static void main(String[] args) {
        SpringApplication.run(BankOfSimbaApp.class, args);
    }
}
