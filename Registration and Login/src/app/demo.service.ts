import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:4040";

  public registerDemo(demoData:any){
      return this.http.post(this.API + '/registerDemo', demoData);
  }
}
