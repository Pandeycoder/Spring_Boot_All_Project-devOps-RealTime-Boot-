import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/services/token-storage.service';

@Component({
  selector: 'app-profile-page',
  templateUrl: './profile-page.component.html',
  styleUrls: ['./profile-page.component.css'],
})
export class ProfilePageComponent implements OnInit {
  currentUser: any;
  constructor(private token: TokenStorageService) {}
  ngOnInit(): void {
    this.currentUser = this.token.getUser();
  }
}
