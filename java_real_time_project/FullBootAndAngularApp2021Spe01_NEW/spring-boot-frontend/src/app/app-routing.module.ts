import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { LoginPageComponent } from './pages/login-page/login-page.component';
import { ProfilePageComponent } from './pages/profile-page/profile-page.component';
import { RegisterPageComponent } from './pages/register-page/register-page.component';
import { UomCreateComponent } from './pages/uom-create/uom-create.component';
import { UomEditComponent } from './pages/uom-edit/uom-edit.component';
import { UomComponent } from './pages/uom/uom.component';

const routes: Routes = [
  { path: 'home', component: HomePageComponent },
  {
    path: 'all',
    component: UomComponent,
  },
  {
    path: 'profile',
    component: ProfilePageComponent,
  },
  {
    path: 'register',
    component: RegisterPageComponent,
  },
  {
    path: 'login',
    component: LoginPageComponent,
  },
  {
    path: 'add',
    component: UomCreateComponent,
  },
  {
    path: 'edit/:id',
    component: UomEditComponent,
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
