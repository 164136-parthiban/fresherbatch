import { Component } from '@angular/core';

@Component({
  selector: 'user',
  template: `
  <h1>Hello {{name}}</h1>
  <p> <strong>Email:</strong> {{email}}</p>
  <p> <strong>Address:</strong> {{address.street}} , {{address.city}} </p>
  <button (click)="toggleHobbies()">{{showHobbies ? "Hide Hobbies" : "Show Hobbies"}}</button>

  <div *ngIf="showHobbies">
       <h3>Hobbies</h3>
       <ol>
          <li *ngFor="let hobby of hobbies">
          {{hobby}}
          </li>
       </ol>
   </div>    
  `,
})
export class UserComponent  {
     name="Parthiban";
     email="parthi96@gmail.com";
     address={
              street:"anandpura",
                 city:"Bangalore"
           }; 
     hobbies:String[]=["riding","painting","yoga"];
     showHobbies:boolean=false;

     toggleHobbies(){
         if(this.showHobbies==true)
         {
             this.showHobbies=false;
         }else
         {
             this.showHobbies=true;
         }
     }
 }