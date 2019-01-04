import { Component } from '@angular/core';
import { Address } from 'cluster';

@Component({
  selector: 'user',
  template: `<h1>Hello {{name}}</h1>
  <P><strong>Email:</strong>{{email}}</p>
  <p><strong>Address:</strong>{{address.street}} {{address.city}}</p>`,
})
export class UserComponent  
{ name="Parthiban";
  email="parthi96@gmail.com";
  address={
              street:"anandpura",
                city:"Bangalore"
            };

//   constructor(){
//       this.name="Parthiban";
//       this.email="parthi96@gmail.com";
//       this.address={
//           street:"anandpura",
//            city:"Bangalore"
//         };
    // }
  }

//   interface address{
//       street:String;
//       city:String;
//   }