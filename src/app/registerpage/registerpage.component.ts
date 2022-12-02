import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-registerpage',
  templateUrl: './registerpage.component.html',
  styleUrls: ['./registerpage.component.css']
})
export class RegisterpageComponent {
  constructor(private demoService: DemoService, private router: Router) {
  }
  register(registerForm: NgForm) {
    this.demoService.registerDemo(registerForm.value).subscribe(
      (resp) => {
        console.log(resp);
        registerForm.reset();
        this.router.navigate(["/loginpage"]);
      },
      (err) => {
        console.log(err);
      }
    );
  }
}
