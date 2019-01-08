import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  
      public students: any; 
	  public searchText: any; 
	  public studentList:student[]=[]; 
	  getTotalStudentsCount() {  
		return this.students.length;  
	}  
	 
	
	    constructor() {  
			
	        this.students = [{  
            Id: 1,  
	            Name: "Mahesh",  
	            Address: "Thane",  
	            Gender: "Male"  
			},
			 {  
            Id: 2,  
	            Name: "Nishikant",  
            Address: "Chembur",  
	            Gender: "Male"  
			}, 
			{  
	            Id: 3,  
            Name: "Sameer",  
            Address: "Mulund",  
            Gender: "Male"  
			}, 
			{  
	            Id: 4,  
	            Name: "Nitin",  
           Address: "Nahur",  
           Gender: "Male"  
		}, 
		{  
	            Id: 4,  
            Name: "Siri",  
	            Address: "Worli",  
            Gender: "Female"  
	        }];  
		}  

		getMaleStudentsCount()
		 {  
			return this.students.filter(student => student.Gender == 'Male').length;  
			}  
			 
			getFemaleStudentsCount() 
			{  
				return this.students.filter(student => student.Gender == 'Female').length;  
		}  

		ngOnInit() {
			this.studentList=[  
				new student(100,"Pankaj Choudhary"),  
				new student(101,"Sandeep Jangid"),  
				new student(102,"Rahul Prajapat"),  
				new student(103,"Sanjeev Baldia")];  
	 }  
		}

		
			   
	


	class student{  
	id:number;  
		name:string;  
		constructor(id:number,name:string){  
		  this.id=id;  
		  this.name=name;  
		}  
		}   
	