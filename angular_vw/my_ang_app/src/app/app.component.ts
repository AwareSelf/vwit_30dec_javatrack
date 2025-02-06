import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { StudlistComponent } from './studlist/studlist.component';
import { StudentregisterComponent } from './studentregister/studentregister.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,StudlistComponent,StudentregisterComponent],
  templateUrl: './app.component.html',
  /*
   template:`<h3>Hello Main App</h3>
             <app-studentregister/>
              <hr/>
            <app-studlist/>`,
            */
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my_ang_app';
  maxStudents:number = 10;
}
