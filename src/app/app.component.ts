import { Component } from '@angular/core';
import { faCoffee } from '@fortawesome/free-solid-svg-icons';
import { HttpClientModule } from '@angular/common/http';

import { CommonModule } from '@angular/common';
import { TaskComponent } from './task/task.component';  // Import standalone component



@Component({
  standalone: true,
  selector: 'app-root',
  imports: [CommonModule,TaskComponent,HttpClientModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'todoapp';
  faCoffee = faCoffee;

}
