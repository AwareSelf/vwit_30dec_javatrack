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

//student-crud service
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

    public Passport getPassportById(Long id)
    {
        Optional<Passport> p = passrepo.findById(id);
        if(p.isPresent())
            return p.get();
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

    @Transactional
    public Student addStudent(Student s)
    {
        System.out.println(s.getStudid()+","+s.getName()+","+s.getTotalMarks());
         Student s1 =srepo.save(s);
                     srepo.flush(); //commit changes to STudent table
        return s1;
    }

    @Transactional
    public Student updateStudent(Long id,String name,int totalmarks)
    {
        Student s1=null;
        Optional<Student> s = srepo.findById(id);
        if(s.isPresent())
        {
            s1 = s.get();
            s1.setName(name);
            s1.setTotalMarks(totalmarks);
            s1 = srepo.save(s1);//this time save() method will update the entity as entity with that Id is already present in database
            return s1;
        }
        else
            return null;
    }

    @Transactional
    public Student updateStudent1(Long id,Student s)
    {
        s = srepo.save(s);//this time save() method will update the entity as entity with that Id is already present in database
          return s;
    }


    @Transactional
    public void deleteStudent(Long studid)
    {
       srepo.deleteById(studid);

    }

}
