package nama.springframework.didemo.components;

import nama.springframework.didemo.interfaces.Instrument;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("I am playing Guitar");
    }
}
