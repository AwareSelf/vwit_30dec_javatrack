import { Injectable } from '@angular/core';
import { Student } from './model/Student';

@Injectable({
  providedIn: 'root'
})
export class StudrestclientService {

  studarr:Student[];
  stud!:Student;

  constructor() {
    this.studarr= [];
    this.stud = new Student(1,"Rohit",200);
    this.studarr.push(this.stud);
    this.studarr.push(new Student(2,"Sheetal",250));

  }

  getAllStudents():Student[]
  {
    return this.studarr.slice(); //return copy of an array and not an original array
  }

  addStudent(stud:Student):boolean
  {
    this.studarr.push(stud);
    return true;
  }
}
