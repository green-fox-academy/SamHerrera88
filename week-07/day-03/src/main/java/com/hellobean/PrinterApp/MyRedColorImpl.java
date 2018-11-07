package Com.hellobean.PrinterApp;

import org.springframework.stereotype.Service;

@Service
public class MyRedColorImpl implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It's red in color...");
    }
}
