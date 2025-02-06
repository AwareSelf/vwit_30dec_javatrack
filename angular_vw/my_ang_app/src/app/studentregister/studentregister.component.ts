import { Component } from '@angular/core';
import { Student } from '../model/Student';
import { FormsModule } from '@angular/forms';
import { StudrestclientService } from '../studrestclient.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-studentregister',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './studentregister.component.html',
  styleUrl: './studentregister.component.css'
})
export class StudentregisterComponent {

  stud:Student;
  isRegistered!:boolean;

  constructor(public studrest:StudrestclientService)
  {
    console.log('student register component created');
    this.stud = new Student(1,"Ram",200);
    this.isRegistered = false;
  }

  addstud(event:Event):void
  {
    event.preventDefault();
    console.log('student added:'+this.stud.name+","+this.stud.totalMarks);
    this.studrest.addStudent(this.stud);
    this.stud = new Student();
    this.isRegistered = true;
  }
}
