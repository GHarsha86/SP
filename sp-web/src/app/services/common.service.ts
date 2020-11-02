import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserDetails } from '../../app/Util/UserDetails'
@Injectable({
  providedIn: 'root'
})
export class CommonService {

  loginDetails: UserDetails;
  loginUrl = 'http://localhost:8081/api/plan/login';
  getAllDetails = 'http://localhost:8081/api/plan/getAllDetails';
  saveDetaislsurl = 'http://localhost:8081/api/plan/saveDetails';

  constructor(private http: HttpClient) {
  }

  login(loginDetails): Observable<any> {
    return new Observable(observer => {
      this.http.post(this.loginUrl, loginDetails).subscribe(response => {
        observer.next(response);
      });
    });
  }

  getAll(): Observable<any> {
    return new Observable(observer => {
      this.http.get(this.getAllDetails).subscribe(response => {
        observer.next(response);
      });
    });
  }

  saveDetails(saveDetails): Observable<any> {
    return new Observable(observer => {
      this.http.post(this.saveDetaislsurl, saveDetails).subscribe(response => {
        observer.next(response);
      });
    });
  }
}
