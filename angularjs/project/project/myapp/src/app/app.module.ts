import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentComponent } from './components/student/student.component';
import { PropertybindingComponent } from './components/propertybinding/propertybinding.component';
import { DatabindingComponent } from './components/databinding/databinding.component';
import { AddnumbersComponent } from './components/addnumbers/addnumbers.component';
import { DirectivesComponent } from './components/directives/directives.component';
import { StudentListComponent } from './components/student-list/student-list.component';
import { StudentCountComponent } from './components/student-count/student-count.component';
import { NamefilterpipePipe } from './namefilterpipe.pipe';
import { HomeComponent } from './components/home/home.component';
import {Routes_Provider} from './app.route';  

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    PropertybindingComponent,
    DatabindingComponent,
    AddnumbersComponent,
    DirectivesComponent,
    StudentListComponent,
    StudentCountComponent,
    NamefilterpipePipe,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    Routes_Provider  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
