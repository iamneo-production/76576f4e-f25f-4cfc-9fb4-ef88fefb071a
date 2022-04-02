import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD

const routes: Routes = [];
=======
import { OrdersComponent } from './admin/orders/orders.component';
import { ProductsComponent } from './admin/products/products.component';
import { CartComponent } from './home/cart/cart.component';
import { HomeComponent } from './home/home.component';
import { MyordersComponent } from './home/myorders/myorders.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'',
    component:LoginComponent
  },
  {
    path:'home',
    component:HomeComponent
  },
  {
    path:'signup',
    component:SignupComponent
  },
  {
    path:'admin/orders',
    component:OrdersComponent
  },
  {
    path:'admin/products',
    component:ProductsComponent
  },
  {
    path:'orders',
    component:MyordersComponent
  },
  {
    path:'cart',
    component:CartComponent
  }
];
>>>>>>> b541e64b423fa6ea74bd26bb00178a14db236504

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
