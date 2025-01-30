package nama.springframework.didemo.components;

import nama.springframework.didemo.interfaces.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="player")
public class MusicPlayer {

    @Qualifier("maininstrument")
    @Autowired
    Instrument instrument;

    public void getPlayerInfo()
    {
         instrument.play();
    }
}
