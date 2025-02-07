package nama.springboot.usingprofiledemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

//https://mkyong.com/spring-boot/spring-boot-configurationproperties-example/
/*
The Relaxed Data Binding
The @ConfigurationProperties annotation supports "relaxed binding",
meaning properties like threadPool, thread-pool are equivalent.
 */
@SpringBootApplication
public class UsingConfigurationPropertiesApplication implements CommandLineRunner {

	@Autowired
	AppProperties appprop;

	@Autowired
	GlobalProperties globprop;

	public static void main(String[] args) {
		SpringApplication.run(UsingConfigurationPropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(appprop.getMenus().get(0).getTitle());
		System.out.println(appprop.getCompiler().getOutputFolder());
		System.out.println(appprop.getError());
		System.out.println(globprop.getEmail());
		System.out.println(globprop.getThreadPool());
	}
}
