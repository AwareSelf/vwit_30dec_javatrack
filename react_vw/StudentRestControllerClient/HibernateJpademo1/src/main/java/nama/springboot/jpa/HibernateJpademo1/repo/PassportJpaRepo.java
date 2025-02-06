package nama.springboot.jpa.HibernateJpademo1.repo;

import nama.springboot.jpa.HibernateJpademo1.entity.Employee;
import nama.springboot.jpa.HibernateJpademo1.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportJpaRepo extends JpaRepository<Passport,Long> {
}
