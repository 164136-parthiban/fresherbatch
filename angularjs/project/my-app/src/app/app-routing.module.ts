import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent }      from './components/home/home.component';
import { UserComponent }      from './components/user/user.component';
import { LocationStrategy, HashLocationStrategy } from '@angular/common';

const routes: Routes = [
  { path: 'home', component: HomeComponent }
];

export const routing = RouterModule.forRoot(routes);

@NgModule({
  declarations: [HomeComponent, UserComponent
    ],
  imports: [BrowserModule,
    CommonModule
  ],
  exports: [ RouterModule ],
  providers: [ { provide: LocationStrategy, useClass: HashLocationStrategy} ]

})





export class AppRoutingModule { }
