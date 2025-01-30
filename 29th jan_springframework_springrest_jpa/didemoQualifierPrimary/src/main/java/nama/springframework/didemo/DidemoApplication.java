package nama.springframework.didemo;

import nama.springframework.didemo.components.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DidemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DidemoApplication.class, args);


		//Using ApplicationContext Spring container
		System.out.println("using Annotation based Application Context Container...");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("nama.springframework.didemo");
		context.refresh();

		MusicPlayer mp = (MusicPlayer)context.getBean("player");
		mp.getPlayerInfo();



	}

}
