	import {RouterModule,Routes} from '@angular/router';  
	import {HomeComponent} from './components/home/home.component';  
	import {StudentListComponent} from './components/student-list/student-list.component';  
	import {StudentComponent} from './components/student/student.component';  
	const APP_ROUTES:Routes=[  
	    {path:'',component:HomeComponent},  
	    {path:'student',component:StudentListComponent},  
	    {path:'student/:id',component:StudentComponent}  
	];  
	  
	export const Routes_Provider=RouterModule.forRoot(APP_ROUTES);  
