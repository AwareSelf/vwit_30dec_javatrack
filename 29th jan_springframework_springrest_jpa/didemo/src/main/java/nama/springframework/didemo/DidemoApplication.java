package nama.springframework.didemo;

import nama.springframework.didemo.components.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DidemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DidemoApplication.class, args);


		//Two Spring Containers: BeanFactory container,ApplicationContext container - interfaces

		//two implementations of ApplicationContext (container) interface
		//1) xml - bean configuration in xml file - ClassPathXmlApplicationContext container
		//2) annotations - bean configuration using annotations - AnnotationConfigApplicationContext container

		//Using ApplicationContext Spring container
		/*
		   AbstractApplicationContext ac = new ClassPathXmlApplicationContext("employees.xml");
             Account ob = (Account)ac.getBean("account");
		     System.out.println(ob.getAcctBal());
			 */

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("nama.springframework.didemo");
		context.refresh();
	//	Account ob = (Account)context.getBean("account");
		Account ob = (Account)context.getBean("accbean");
		System.out.println(ob.getAcctBal());
		System.out.println(ob);




	}

}
