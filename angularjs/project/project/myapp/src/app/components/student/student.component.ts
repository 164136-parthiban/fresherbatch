import { Component, OnInit } from '@angular/core';

	import { ActivatedRoute } from '@angular/router'

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

	public studentList:student[]=[  
                     new student(100,"Pankaj Choudhary","P-20 Gandhi Nagar Alwar","Software Developer"),  
  	                  new student(101,"Sandeep Jangid","G14 Vasant Vihar , Jaipur","Electrical Enginner"),  
                    new student(102,"Rahul Prajapat","K1-104, CR Park Delhi","DBA"),  
   	                  new student(103,"Sanjeev Baldia","D-19, Malviya Nagar, Jaipur","Sales Head")];  
   	  
   	public studentInfo:student;  
    	public studentId:number;  
    	  constructor(private route: ActivatedRoute)   
    	  {  
 	    this.route.params.subscribe(params=>{  
   	      this.studentId=params['id'];  
    	  });  
  	  
    	    this.studentInfo=this.studentList.find(x=>x.id==this.studentId);  
  	   }  
   	  
      ngOnInit() {  
    	  }  
   	  
    	}  
   	class student{  
    	id:number;  
   	name:string;  
   	address:string;  
   	jobProfile:string;  
   	  
   	constructor(id:number,name:string,address:string,jobProfile:string){  
  	  this.id=id;  
    	  this.name=name;  
   	  this.address=address;  
  	  this.jobProfile=jobProfile;  
 	}  
    	}  
    