import { Component } from '@angular/core';
import { AppService } from '../app/app.component.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public email:string;
  public password:string;
  public address:string;
  public inputCity:string;
  public zipCode:string;


  public emailH:string;
  public passwordH:string;
  public addressH:string;
  public inputCityH:string;
  public zipCodeH:string;

  constructor(private service:AppService ){

  }
  submitFormBadHandled() {
    let data = {};
    data["name"] = this.emailH;
    data["password"] = this.passwordH;
    data["address"] = this.addressH;
    data["city"] = this.inputCityH;
    data["zipCode"] = this.zipCodeH;

    console.log(data);
    this.service.submitFormH(data).subscribe( response => {
      console.log(response);
    },
    error =>{
      console.log("Error while calling save service"+error);
    })
  }
  submitForm(){

    let data = {};
    data["name"] = this.email;
    data["password"] = this.password;
    data["address"] = this.address;
    data["city"] = this.inputCity;
    data["zipCode"] = this.zipCode;

    console.log(data);
    this.service.submitForm(data).subscribe( response => {
      console.log(response);
    },
    error =>{
      console.log("Error while calling save service"+error);
    })


  }
}
