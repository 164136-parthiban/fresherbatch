import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  name:String;
  age:Number;
  email:String;
  address:{
    street:String,
    city:String,
    state:String
  }
  hobbies:String[]=["riding","painting","yoga"];
  showHobbies:boolean=false;

  constructor() {}

  ngOnInit() {
    this.age=22;
    this.name="parthi";
    this.email="parthi96@gmail.com";
    this.address={
      street:"Anandpura",
      city:"Bangalore",
      state:"Karnataka"
    }
    
  }

  
  toggleHobbies(){
    if(this.showHobbies==true)
    {
        this.showHobbies=false;
    }else
    {
        this.showHobbies=true;
    }
  }
  
  addHobby(hobby){
    this.hobbies.unshift(hobby);
    return false;
  }

  deleteHobby(hobby){
    for(let index=0;index<this.hobbies.length;index++)
    {
      if(this.hobbies[index]==hobby)
      {
        this.hobbies.splice(index,1);
      }
    }
    


  }

}
