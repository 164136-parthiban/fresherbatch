import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';


import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './components/employee-list/employee-list.component';
import { EmpsearchPipe } from './empsearch.pipe';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    EmpsearchPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
