package nama.springboot.jpa.HibernateJpademo1.service;


import jakarta.transaction.Transactional;
import nama.springboot.jpa.HibernateJpademo1.entity.Passport;
import nama.springboot.jpa.HibernateJpademo1.entity.Student;
import nama.springboot.jpa.HibernateJpademo1.repo.PassportJpaRepo;
import nama.springboot.jpa.HibernateJpademo1.repo.StudentJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentJpaRepo srepo;

    @Autowired
    private PassportJpaRepo passrepo;

    public List<Student> findAllStuds()
    {
        return srepo.findAll();
    }
    public Student getStudentById(Long id)
    {
        Optional<Student> s = srepo.findById(id);
        if(s.isPresent())
            return s.get();
        else
            return null;
    }

    @Transactional
    public Passport addPassport(Passport p)
    {
        Passport p1 = passrepo.save(p);
                      passrepo.flush();//commit the entity into database
                      return p1;
    }

}
