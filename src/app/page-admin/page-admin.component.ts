import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-page-admin',
  templateUrl: './page-admin.component.html',
  styleUrls: ['./page-admin.component.css'],
})
export class PageAdminComponent {

  listaForm: FormGroup;
  arrLista: any[] = [];
 

  constructor(private fb: FormBuilder) {
    this.listaForm = this.fb.group({
      nombre: ['', Validators.required],
      ingrediente: ['', Validators.required],
      precio: ['', Validators.required],
    });
  }

  sendData() {
    
    let varNombre = this.listaForm.value.nombre;
    let varIngrediente = this.listaForm.value.ingrediente;
    let varPrecio = this.listaForm.value.precio;

    this.arrLista.push({
      id: this.arrLista.length,
      nombre: varNombre,
      ingrediente: varIngrediente,
      precio: varPrecio,
    });

    this.listaForm.patchValue({ nombre: '', ingrediente: '', precio: '' });
  }

  delete( id: any){
    this.arrLista = this.arrLista.filter(g => g.id != id); 
    }
  


}
