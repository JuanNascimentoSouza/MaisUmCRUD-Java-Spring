import { CoursesService } from './../services/courses.service';
import { Component, NgModule, OnInit } from '@angular/core';
import { Course } from '../model/course';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})

export class CoursesComponent implements OnInit {

  courses: Course[] = [];
  displayedColumns = ['name','category']

    //  coursesService: CoursesService;

  constructor(private coursesService: CoursesService) {
    //    this.courses = [];
    //    this.coursesService = new CoursesService();
   }

  ngOnInit(): void {
    this.courses = this.coursesService.list();
  }

}
