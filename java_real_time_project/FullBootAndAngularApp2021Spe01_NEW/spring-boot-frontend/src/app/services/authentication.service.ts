import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { JwtModel } from '../models/jwt-model';
import { LoginModel } from '../models/login-model';
import { MessageModel } from '../models/message-model';
import { UserModel } from '../models/user-model';

const baseUrl = environment.baseUrl + '/auth';

@Injectable({
  providedIn: 'root',
})
export class AuthenticationService {
  constructor(private http: HttpClient) {}
  // register
  registerUser(user: UserModel): Observable<MessageModel> {
    return this.http.post<MessageModel>(`${baseUrl}/register`, user);
  }
  // login
  loginUser(login: LoginModel): Observable<JwtModel> {
    return this.http.post<JwtModel>(`${baseUrl}/login`, login);
  }
}
