package nama.springboot.jpa.HibernateJpademo1;

import nama.springboot.jpa.HibernateJpademo1.entity.Employee;
import nama.springboot.jpa.HibernateJpademo1.repo.EmpJpaRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class HibernateJpademo1Application implements CommandLineRunner {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmpJpaRepo emprepo;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpademo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee("namrata",5000);
		Employee e2 = new Employee("nita",15000);
		Employee e3 = new Employee("akash",8000);
		emprepo.save(e1);
		emprepo.save(e2);
		emprepo.save(e3);
		log.info("total employee entities {}",emprepo.count());
		Optional<Employee> e = emprepo.findById(2L);
		if(e.isPresent())
			System.out.println(e.get());

		emprepo.deleteById(2L);
		log.info("total employee entities {}",emprepo.count());




	}
}
