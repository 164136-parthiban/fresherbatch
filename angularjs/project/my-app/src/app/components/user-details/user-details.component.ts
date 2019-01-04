import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent{

  constructor(route : ActivatedRoute) {  
    this.userInfo = route.snapshot.params["name"]; }

    userInfo : string; 

    
  }
