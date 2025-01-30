package nama.springframework.didemo.config;

import nama.springframework.didemo.components.Account;
import nama.springframework.didemo.components.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean(value="acct") //but you can override beanid name with value attribute
    public Account account() //by default beanid will be same as method name
    {
        return new Account(1,"sita",7000);
    }


    @Bean
    public Account account1() //by default beanid will be same as method name
    {
        return new Account(2,"Gita",8000);
    }





    @Bean
    public Employee emp()
    {

        return new Employee(1,"Rahul",
                6000,account());
    }
}
