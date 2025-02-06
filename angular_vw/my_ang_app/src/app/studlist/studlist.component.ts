import { Component, EventEmitter, Input } from '@angular/core';
import { Student } from '../model/Student';
import { StudrestclientService } from '../studrestclient.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-studlist',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './studlist.component.html',
  styleUrl: './studlist.component.css'
})
export class StudlistComponent {

  @Input() max_stud_allowed!:number;
  studarr!:Student[];
  updateStud!:Student;
  flag!:boolean;




  constructor(public studrest:StudrestclientService )
  {
     console.log("Student Rest Client Component created..");

     this.flag = false;
    // this.updateStud =  new Student();
     this.studrest.getAllStudents().subscribe((studarr:Student[])=>{
          this.studarr = studarr;
          console.log(this.studarr.length);

     })
  }


  getAllStudents():Student[]
  {
    this.studrest.getAllStudents().subscribe((studarr:Student[])=>{
      this.studarr = studarr;
      console.log(this.studarr.length);
       })
    return this.studarr;
  }

  deleteStudent(id:number):void
  {
     console.log('student with studid:'+id+' to be deleted');
     this.studrest.deleteStudent(id).subscribe((s:string)=>{

      console.log(s);
      this.studarr = this.studarr.filter(s1=>s1.studid!=id)
      this.studrest.setStudentArr(this.studarr);

    });


  }

  editStudent(s:Student):void
  {
    console.log('student to be updated with student id:'+s.studid);

    this.updateStud = new Student(s.studid,s.name,s.totalMarks);
    this.flag = true;
  }

  updateStudent():void
  {
     this.studrest.updateStudent(this.updateStud).subscribe((s:Student)=>{
          console.log('updated student:studid:'+s.studid+",name:"+s.name+",totalmarks:"+s.totalMarks);

          this.studarr = this.studarr.map(st=>{
             if(st.studid===s.studid)
             {
                st.name = s.name;
                st.totalMarks = s.totalMarks;
                return st;
             }
             else
             {
               return st;
            }
          });

          this.studrest.setStudentArr(this.studarr);
          this.flag = false;

     });//subscribe ends
  }


}
