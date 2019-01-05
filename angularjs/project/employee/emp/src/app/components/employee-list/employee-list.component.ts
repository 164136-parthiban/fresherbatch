import { Component, OnInit } from '@angular/core';
import { IEmployee } from 'src/app/iemployee';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  
  employee:IEmployee[]=[
    {
      empId:"E164136",
      name:"Parthiban",
      email:"parthi96@gmail.com",
      phone:"9739220198",
      salary:15000,
      appraisalRating:5

    },
    {
      empId:"E164136",
      name:"Sunil",
      email:"sunil@gmail.com",
      phone:"6566464131",
      salary:15000,
      appraisalRating:3
    }
  ]

  constructor() { }

  ngOnInit() {
  }

}
