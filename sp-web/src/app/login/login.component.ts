import { Component, OnInit } from '@angular/core';
import { UserDetails } from '../../app/Util/UserDetails'
import { CommonService } from '../../app/services/common.service'
import { Subscription, timer } from 'rxjs';
import { switchMap } from 'rxjs/operators';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  login: UserDetails = {};
  allDetails: UserDetails = {};
  loginstatus = true;
  sessionDetails: UserDetails = {};
  subscription: Subscription;
  statusText: string;
  constructor(private common: CommonService) {
  }

  ngOnInit(): void {

  }

  loginN() {
    const details = {
      userName: this.login.userName,
      password: this.login.password
    }
    this.common.login(details).subscribe((response: any) => {
      if (response !== null && response.length != 0) {
        this.loginstatus = false;
        this.subscription = timer(0, 5000).pipe(
          switchMap(() => this.common.getAll())
        ).subscribe(all => {
          this.allDetails = all
        });
      }
    });
  }

  changed(event) {
    const details = {
      userId: this.sessionDetails.userId,
      userName: this.login.userName,
      password: this.login.password,
      dropDownValue: event
    }
    this.common.saveDetails(details).subscribe(response => { });

  }
}
