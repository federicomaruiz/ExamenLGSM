import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageMenuplatosComponent } from './page-menuplatos/page-menuplatos.component';
import { PageCocktailsComponent } from './page-cocktails/page-cocktails.component';
import { PageAdminComponent } from './page-admin/page-admin.component';
import { MenuNavComponent } from './menu-nav/menu-nav.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    PageMenuplatosComponent,
    PageCocktailsComponent,
    PageAdminComponent,
    MenuNavComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
