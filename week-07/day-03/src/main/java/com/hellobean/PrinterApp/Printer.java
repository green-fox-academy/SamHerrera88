package Com.hellobean.PrinterApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {


    @Qualifier("myRedColorImpl")
    @Autowired
    MyColor myColor;



    public void log(String message) {
        myColor.printColor();
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}