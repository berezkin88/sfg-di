package person.birch.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.beans.BeanProperty;

@Primary
@Service
public class PrimaryGreatingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - From the PRIMARY";
    }
}
