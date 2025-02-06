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
@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("stud/passport/{id}/")
    public ResponseEntity<Passport> getStudentsPassport(@PathVariable Long id)
    {
        Student s = studser.getStudentById(id);
        if(s!=null)
        {
            Passport p = s.getStudPass();
            if(p!=null)
               return new ResponseEntity<>(p,HttpStatus.OK);
            else
                return new ResponseEntity<>(p,HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);

    }

    @GetMapping("passport/stud/{passportid}")
    public ResponseEntity<Student> getPassportOfStudent(@PathVariable Long passportid)
    {

       Passport p = studser.getPassportById(passportid);
        if(p!=null)
        {
           Student s = p.getStudent();
            if(s!=null) {
                return new ResponseEntity<>(s, HttpStatus.OK);
            }
            else
                return new ResponseEntity<>(s,HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }





    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student s)
    {
        if(s==null)
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);


        Student s1 = studser.addStudent(s);
        if(s1!=null)
           return new ResponseEntity<>(s1,HttpStatus.CREATED);
        else
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @PutMapping("/student/update/{studid}/{studname}/{studmarks}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long studid,
                                                  @PathVariable String studname,
                                                 @PathVariable int studmarks)
    {
        Student s = studser.updateStudent(studid,studname,studmarks);
        if(s!=null)
          return new ResponseEntity<>(s,HttpStatus.OK);
        else
            return new ResponseEntity<>(s,HttpStatus.NOT_FOUND);

    }


    @PutMapping("/student/update/{studid}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long studid,
                                                 @RequestBody Student s
                                              )
    {
        s = studser.updateStudent1(studid,s);
        if(s!=null)
            return new ResponseEntity<>(s,HttpStatus.OK);
        else
            return new ResponseEntity<>(s,HttpStatus.NOT_FOUND);

    }



    @PostMapping("/passport")
    public ResponseEntity<Passport> addPassport(@RequestBody Passport p)
    {
        if(p==null)
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        else {
            Passport p1 = studser.addPassport(p);

            if(p1!=null)
              return new ResponseEntity<>(p1,HttpStatus.CREATED);
            else
                return new ResponseEntity<>(p1,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //as we have Student's Passport to cascade=Cascaded.ALL when you delete student it's
    //associated passport entity will also get deleted if present
    @DeleteMapping("delete/student/{studid}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long studid)
    {
        if(studid==null || studid<=0)
            return new ResponseEntity<>("studid not given properly",HttpStatus.BAD_REQUEST);
        studser.deleteStudent(studid);
        return new ResponseEntity<>("student with studid:"+studid+" deleted",HttpStatus.OK);

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
