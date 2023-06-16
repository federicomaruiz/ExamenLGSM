import { Component } from '@angular/core';

@Component({
  selector: 'app-page-menuplatos',
  templateUrl: './page-menuplatos.component.html',
  styleUrls: ['./page-menuplatos.component.css']
})
export class PageMenuplatosComponent {

  menu = "Estos son todos los menus que tenemos disponibles"
  
  arrLista: any[] = [
    { nombre: "Gazpacho", ingrediente: "Salsa de tomate", precio: "15" },
    { nombre: "Carne", ingrediente: "Ternera", precio: "28" },
    { nombre: "Pescado", ingrediente: "Especias", precio: "20" },
    { nombre: "Tortilla", ingrediente: "patatas", precio: "12" },
    { nombre: "Pollo", ingrediente: "carnes blancas", precio: "7" },
  ];


}
