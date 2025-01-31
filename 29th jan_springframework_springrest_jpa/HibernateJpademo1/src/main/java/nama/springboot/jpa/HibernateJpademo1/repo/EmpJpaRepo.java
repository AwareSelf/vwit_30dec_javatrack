package nama.springboot.jpa.HibernateJpademo1.repo;

import nama.springboot.jpa.HibernateJpademo1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpJpaRepo extends JpaRepository<Employee,Long> {
}
