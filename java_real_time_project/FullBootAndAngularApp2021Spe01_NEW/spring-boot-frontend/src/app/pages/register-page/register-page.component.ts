import { Component, OnInit } from '@angular/core';
import { UserModel } from 'src/app/models/user-model';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styleUrls: ['./register-page.component.css'],
})
export class RegisterPageComponent implements OnInit {
  user: UserModel = new UserModel('', '', '');
  isSuccessful: boolean = false;
  message: string = '';
  constructor(private auth: AuthenticationService) {}
  ngOnInit(): void {}
  onSubmit() {
    this.auth.registerUser(this.user).subscribe(
      (data) => {
        console.log(data);
        this.isSuccessful = true;
        this.message = data.message;
      },
      (err) => {
        console.log(err);
        this.isSuccessful = false;
        this.message = err.error.message;
      }
    );
  }
}
