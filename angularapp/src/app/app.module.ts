import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AddProductComponent } from './add-product/add-product.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AddProductComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
=======

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,

    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
