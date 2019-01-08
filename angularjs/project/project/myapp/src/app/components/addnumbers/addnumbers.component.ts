import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-addnumbers',
  templateUrl: './addnumbers.component.html',
  styleUrls: ['./addnumbers.component.css']
})
export class AddnumbersComponent implements OnInit {
                number1:number;  
  	            number2:number;  
                ans:number;  
  	            constructor() { }  
  	            ngOnInit() {  
  	            }  
  	      add(){  
  	            this.ans=this.number1+this.number2;  
  	            }  
  

}
