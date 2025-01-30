package nama.springframework.didemo.components;

import nama.springframework.didemo.interfaces.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("maininstrument")
@Component
public class Violin implements Instrument {
    @Override
    public void play() {
        System.out.println("I am playing violin");
    }
}
