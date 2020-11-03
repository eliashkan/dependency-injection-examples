package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("ES")
public class I18nSpanishService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hole Mundo - ES";
    }
}
