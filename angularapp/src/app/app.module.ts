import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { CartComponent } from './home/cart/cart.component';
import { MyordersComponent } from './home/myorders/myorders.component';
import { AdminComponent } from './admin/admin.component';
import { ProductsComponent } from './admin/products/products.component';
import { OrdersComponent } from './admin/orders/orders.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    CartComponent,
    MyordersComponent,
    AdminComponent,
    ProductsComponent,
    OrdersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
