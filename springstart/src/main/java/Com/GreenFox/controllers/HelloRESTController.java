package Com.GreenFox.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam("name") String name,AtomicLong atomicLong) {
        return new Greeting(1,"Hello," + name);
    }
}
