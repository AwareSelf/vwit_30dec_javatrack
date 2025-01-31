package nama.springboot.jpa.HibernateJpademo1.restcontroller;



import nama.springboot.jpa.HibernateJpademo1.entity.Employee;
import nama.springboot.jpa.HibernateJpademo1.entity.Passport;
import nama.springboot.jpa.HibernateJpademo1.entity.Student;
import nama.springboot.jpa.HibernateJpademo1.repo.PassportJpaRepo;
import nama.springboot.jpa.HibernateJpademo1.repo.StudentJpaRepo;
import nama.springboot.jpa.HibernateJpademo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    StudentService studser;


    public StudentRestController()
    {
        System.out.println("Student Rest Controller created..");

    }

    @GetMapping("all/studs")
    public ResponseEntity<List<Student>> getAllStudents()
    {
       return new ResponseEntity<>(studser.findAllStuds(),HttpStatus.OK);
    }

    @GetMapping("/stud/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id)
    {
          Student s = studser.getStudentById(id);
          if(s!=null)
           return new ResponseEntity<>(s, HttpStatus.OK);
          else
           return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

/*
    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student s)
    {
        if(s==null)
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);


        Student s1 = srepo.save(s);
        srepo.flush();
        return new ResponseEntity<>(s1,HttpStatus.CREATED);
    }

*/
    @PostMapping("/passport")
    public ResponseEntity<Passport> addPassport(@RequestBody Passport p)
    {
        if(p==null)
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        else {
            Passport p1 = studser.addPassport(p);
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }
    }


    /*
    @GetMapping("/stud/passport")
    public Passport getStudentPassport(@RequestParam(name = "studid") Long id)
    {

    }



    @GetMapping("/stud/name/{name}")
    public Student getStudentByName(@PathVariable String name)
    {

    }

     */

}
