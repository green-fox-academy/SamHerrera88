package Com.hellobean.PrinterApp;

import org.springframework.stereotype.Service;

@Service
public class MyOrangeColorImpl implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It's orange in color...");
    }
}
