package nama.springboot.usingprofiledemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://mkyong.com/spring-boot/spring-boot-profiles-example/

@SpringBootApplication
public class ExceptionHandlingInRestApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlingInRestApplication.class, args);
	}

	@Override
	public void run(String... args) {

	}
}
