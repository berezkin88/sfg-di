package person.birch.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import person.birch.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
