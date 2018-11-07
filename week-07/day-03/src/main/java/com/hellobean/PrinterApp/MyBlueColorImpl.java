package Com.hellobean.PrinterApp;

import org.springframework.stereotype.Service;

@Service
public class MyBlueColorImpl implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It's blue in color...");
    }
}
