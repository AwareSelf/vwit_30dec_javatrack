import { Injectable } from '@angular/core';
import { Student } from './model/Student';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable,of } from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class StudrestclientService {

  studarr:Student[];
  stud!:Student;
  baseurl:string;

  httpoptions =  {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      })
    }

  constructor(private httpclient:HttpClient) {
    this.studarr= [];
    this.baseurl="http://localhost:8080/";
    }

  getAllStudents():Observable<Student[]>
  {
    //am returning the Observable to the caller instead of suscribing it here
    //as i want it's caller (StudentList Component) to collect the student array in response
    return  this.httpclient.get<Student[]>(this.baseurl+"all/studs");
  }

  addStudent(stud:Student):boolean
  {
    console.log('inside service to add student:name:'+stud.name+",totalMarks:"+stud.totalMarks);

     //push it to backend server
     let s = {name:stud.name,totalMarks:stud.totalMarks};
     this.httpclient.post<Student>(this.baseurl+"student",s,this.httpoptions)
     .subscribe((stu:Student)=>{
      console.log(stu.studid+","+stu.name+","+stu.totalMarks);
      this.studarr.push(stu);
    });

    return true;
  }

  deleteStudent(studid:number):Observable<string>
  {

    return this.httpclient.delete<string>(this.baseurl+"delete/student/"+studid);
  }


  updateStudent(s:Student):Observable<Student>
  {
    return this.httpclient.put<Student>(this.baseurl+"student/update/"+s.studid,s);
  }


  setStudentArr(studarr:Student[]):void
  {
    this.studarr = studarr.slice();
  }
}
