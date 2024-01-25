import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminauthService {
  private readonly validUsername = 'user';
  private readonly validPassword = 'user';

  constructor() {}

  authenticate(username: string, password: string): boolean {
    console.log('Attempting to authenticate:', username, password);
  
    if (username === this.validUsername && password === this.validPassword) {
      sessionStorage.setItem('username2', username);
      console.log('Authentication successfull');
      return true;
    } else {
      console.log('Authentication failed');
      return false;
    }
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('username2');
    console.log('User:', user);
    console.log('Is logged in:', !(user === null));
    return !(user === null);
  }

  logOut(): void {
    sessionStorage.removeItem('username2');
  }
}
