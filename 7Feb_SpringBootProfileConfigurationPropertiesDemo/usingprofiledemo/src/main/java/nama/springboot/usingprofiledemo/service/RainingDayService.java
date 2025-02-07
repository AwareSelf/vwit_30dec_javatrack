package nama.springboot.usingprofiledemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"raining","test"})
public class RainingDayService implements WeatherService {

    @Override
    public String forecast() {
        return "Today is raining day!";
    }

}