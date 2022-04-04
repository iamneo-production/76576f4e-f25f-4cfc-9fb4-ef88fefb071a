import { AdminNavComponent } from './admin/admin-nav/admin-nav.component';
import { DashboardComponent } from './admin/dashboard/dashboard.component';
import { AddproductComponent } from './admin/addproduct/addproduct.component';
import { OrderlistComponent } from './admin/orderlist/orderlist.component';
import { ProductEditComponent } from './admin/product-edit/product-edit.component';
import { PageNotFoundComponent } from './admin/page-not-found/page-not-found.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '',redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'admin-nav', component: AdminNavComponent },
  { path: 'dashboard', component: DashboardComponent},
  { path: 'addproduct', component: AddproductComponent},
  { path: 'orderlist', component: OrderlistComponent},
  { path: 'product-edit', component: ProductEditComponent},
  { path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[AdminNavComponent, DashboardComponent, AddproductComponent, OrderlistComponent, ProductEditComponent, PageNotFoundComponent]
