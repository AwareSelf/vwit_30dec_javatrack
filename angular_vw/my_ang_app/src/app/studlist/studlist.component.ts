import { Component, Input } from '@angular/core';
import { Student } from '../model/Student';
import { StudrestclientService } from '../studrestclient.service';

@Component({
  selector: 'app-studlist',
  standalone: true,
  imports: [],
  templateUrl: './studlist.component.html',
  styleUrl: './studlist.component.css'
})
export class StudlistComponent {

  @Input() max_stud_allowed!:number;
  studarr!:Student[];
  s1!:Student;


  constructor(public studrest:StudrestclientService )
  {
     console.log("Student Rest Client Component created..");
     this.studarr = this.studrest.getAllStudents();
  }


  getAllStudents():Student[]
  {
    this.studarr =  this.studrest.getAllStudents();
    return this.studarr;
  }

  deleteStudent(id:number):void
  {
     console.log('student with studid:'+id+' to be deleted');
  }

  updateStudent(s:Student):void
  {
    console.log('student to be updated with student id:'+s.studid);

  }


}
