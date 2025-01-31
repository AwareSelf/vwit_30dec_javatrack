package nama.springboot.jpa.HibernateJpademo1.repo;

import jakarta.transaction.Transactional;
import nama.springboot.jpa.HibernateJpademo1.entity.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentJpaRepo extends JpaRepository<Student,Long> {


  @Transactional
  void  deleteByName(String name);

  Long countByName(String name);

  //JPA Query - you use Entity name and entity property names in query
  @Query("Select  s From Student s where name like '%e%'")
  List<Student> studentWithPatternInName();

  //This is native sql query, it uses actual table name and column names
  @Query(value = "Select  *  From Stud where studname like 'R%'", nativeQuery = true)
  List<Student> studentWithPatternInNameUsingNativeQuery();

}
