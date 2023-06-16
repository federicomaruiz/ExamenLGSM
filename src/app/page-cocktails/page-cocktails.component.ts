import { Component, OnInit } from '@angular/core';
import { MyServiceService } from '../my-service.service';

@Component({
  selector: 'app-page-cocktails',
  templateUrl: './page-cocktails.component.html',
  styleUrls: ['./page-cocktails.component.css']
})
export class PageCocktailsComponent implements OnInit {

  titulo = "The best cocktails"
  margaritas:any;

  constructor(private Service: MyServiceService){ }

  ngOnInit(): void {
    this.Service.getMargaritas().subscribe(data => {this.margaritas = data.drinks })
  }

}
