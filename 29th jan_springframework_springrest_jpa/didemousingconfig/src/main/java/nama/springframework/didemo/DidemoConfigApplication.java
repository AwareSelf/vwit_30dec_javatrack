package nama.springframework.didemo;

import nama.springframework.didemo.components.Account;
import nama.springframework.didemo.components.Employee;
import nama.springframework.didemo.config.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DidemoConfigApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DidemoApplication.class, args);


		//Using ApplicationContext Spring container

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		//Account act = (Account)context.getBean("account");
		Account act = (Account)context.getBean("acct");
		System.out.println(act.getAcctBal());
		System.out.println(act);

		Account act1 = (Account)context.getBean("account1");
		System.out.println(act1.getAcctBal());
		System.out.println(act1);

		Employee e = (Employee)context.getBean("emp");
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpAcct().getAcctBal());









	}

}
