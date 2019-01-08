import { Component, OnInit, Input  } from '@angular/core';

@Component({
  selector: 'app-student-count',
  templateUrl: './student-count.component.html',
  styleUrls: ['./student-count.component.css']
})
export class StudentCountComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  
	    @Input()  
	    totalStudentsCount: any;  
	    @Input()  
    maleStudentsCount: any;  
	    @Input()  
    femaleStudentsCount: any;  
    
	    selectedRadioButton: any = "All";  

  

}
