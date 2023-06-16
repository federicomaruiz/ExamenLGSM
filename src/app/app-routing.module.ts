import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageMenuplatosComponent } from './page-menuplatos/page-menuplatos.component';
import { PageCocktailsComponent } from './page-cocktails/page-cocktails.component';
import { PageAdminComponent } from './page-admin/page-admin.component';

const routes: Routes = [
  {path: 'menuplatos', component: PageMenuplatosComponent},
  {path: 'cocktails', component: PageCocktailsComponent},
  {path: 'admin', component: PageAdminComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
