package nama.springboot.usingprofiledemo;

import nama.springboot.usingprofiledemo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://mkyong.com/spring-boot/spring-boot-profiles-example/

@SpringBootApplication
public class UsingprofiledemoApplication implements CommandLineRunner {

	@Autowired
	private WeatherService weatherService;

	public static void main(String[] args) {
		SpringApplication.run(UsingprofiledemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(weatherService.forecast());
	}
}
