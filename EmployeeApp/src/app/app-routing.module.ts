import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmphomeComponent } from './emphome/emphome.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';


const routes: Routes = [

  {path:"",redirectTo:"home",pathMatch:'full'},
  { path: 'home', component: EmphomeComponent },
  { path: 'AddEmp', component: EmployeeComponent },
 { path: 'getAllEmp', component: EmployeeListComponent },
 { path: 'getsingleEmp', component: EmployeeDetailsComponent }



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
