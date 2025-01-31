package nama.springboot.jpa.HibernateJpademo1;

import nama.springboot.jpa.HibernateJpademo1.entity.Employee;
import nama.springboot.jpa.HibernateJpademo1.entity.Passport;
import nama.springboot.jpa.HibernateJpademo1.entity.Student;
import nama.springboot.jpa.HibernateJpademo1.repo.EmpJpaRepo;
import nama.springboot.jpa.HibernateJpademo1.repo.PassportJpaRepo;
import nama.springboot.jpa.HibernateJpademo1.repo.StudentJpaRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HibernateJpaDemoEmpAppLazyFetch implements CommandLineRunner {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmpJpaRepo emprepo;

	@Autowired
	private PassportJpaRepo passrepo;

	@Autowired
	private StudentJpaRepo srepo;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaDemoEmpAppLazyFetch.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		Passport p1 = new Passport("Rohit", LocalDate.now());
		passrepo.save(p1);

		Passport p2 = new Passport("Sheetal", LocalDate.of(2025, 01, 30));
		passrepo.save(p2);

		Employee e4 = new Employee("Rohit", 5000, p1);
		emprepo.save(e4);

		Employee e5 = new Employee("Sheetal", 15000, p2);
		emprepo.save(e5);

		getEmpById(1L);
		getEmpByName("rohit");
		getEmpByNameAndSalary("rohit",5000);


		System.out.println(emprepo.count());

		emprepo.deleteById(1L);
		System.out.println(emprepo.count());


		 */


		Passport p1 = new Passport("Rohit", LocalDate.now());
		passrepo.save(p1);

		Passport p2 = new Passport("Sheetal", LocalDate.of(2025, 01, 30));
		passrepo.save(p2);

		Passport p3 = new Passport("Rohit1", LocalDate.now());
		passrepo.save(p3);

		Passport p4 = new Passport("Sheetal1", LocalDate.of(2025, 01, 30));
		passrepo.save(p4);
		Passport p5 = new Passport("Rohit2", LocalDate.now());
		passrepo.save(p5);

		Passport p6 = new Passport("Sheetal2", LocalDate.of(2025, 01, 30));
		passrepo.save(p6);

		Student s1 = new Student("Rohit", 500, p1);
		srepo.save(s1);

		Student s2 = new Student("Sheetal", 150, p2);
		srepo.save(s2);

		Student s3 = new Student("Rohit1", 500, p3);
		srepo.save(s3);

		Student s4 = new Student("Sheetal1", 150, p4);
		srepo.save(s4);

		Student s5 = new Student("Rohit2", 500, p5);
		srepo.save(s5);

		Student s6 = new Student("Sheetal2", 150, p6);
		srepo.save(s6);


		List<Student> lst = srepo.studentWithPatternInName();
		System.out.println(lst);

		List<Student> lst1 = srepo.studentWithPatternInNameUsingNativeQuery();
		System.out.println(lst1);

		//System.out.println(srepo.findAll());

		Sort sort = Sort.by(Sort.Direction.DESC, "name");
		System.out.println("Sorted Employees based on names in descending order: "+ srepo.findAll(sort));

		long ct = srepo.count();


		//Pageable secondPageWithFiveElements = PageRequest.of(1, 5);
		for(int i=0;i<ct/2;i++) {
			System.out.println("Batch:"+(i+1));
			Pageable firstPageWithTwoElements = PageRequest.of(i, 2);
			Page<Student> p = srepo.findAll(firstPageWithTwoElements);
			p.get().forEach(s -> System.out.println(s));
		}
	}

	public void getEmpById(Long id)
	{
			//find the Passport details of Employee with id 1
			Optional<Employee> x = emprepo.findById(id);
			if(x.isPresent())
			{
				Employee ee = x.get(); //fully populated
				System.out.println(ee.getName());
				Passport p = ee.getEmpPass();
				System.out.println(p);
			}

	}

	public void getEmpByName(String name)
	{
		//find employee by name
		Optional<Employee> x= emprepo.findByName(name);
		if(x.isPresent())
		{
			System.out.println(x.get());
		}

	}
	public void getEmpByNameAndSalary(String name,double sal)
	{
		//find the Employee with given name and salary
		Optional<Employee> x = emprepo.findByNameAndSalary(name,sal);
		if(x.isPresent())
		{
			System.out.println(x.get());
		}

	}



}

