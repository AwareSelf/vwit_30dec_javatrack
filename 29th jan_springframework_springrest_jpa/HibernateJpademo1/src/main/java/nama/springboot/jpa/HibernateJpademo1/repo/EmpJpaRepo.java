package nama.springboot.jpa.HibernateJpademo1.repo;

import jakarta.transaction.Transactional;
import nama.springboot.jpa.HibernateJpademo1.entity.Employee;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface EmpJpaRepo extends JpaRepository<Employee,Long> {


    @EntityGraph(attributePaths = "empPass") //Data-JPA 2.1 //add this for lazy fetching
    Optional<Employee> findById(Long id);

    @EntityGraph(attributePaths = "empPass")
    Optional<Employee> findByName(String name);

    @EntityGraph(attributePaths = "empPass")
    Optional<Employee> findByNameAndSalary(String name,double salary);

}
