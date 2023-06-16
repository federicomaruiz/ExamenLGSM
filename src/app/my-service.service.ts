import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyServiceService {

  margaritaURL = 'https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita'

  constructor(private http: HttpClient) { }

  getMargaritas(){
    return this.http.get<any>(this.margaritaURL);
   }

}
