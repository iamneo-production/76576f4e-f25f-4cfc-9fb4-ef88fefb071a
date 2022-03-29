import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import{HttpClient}from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AddProdService {

  constructor(private http:HttpClient) { }
  addProd(d_name:string,d_price:string,desc:string,d_imgurl:File,d_quant:string):Observable<any>{
    const formData:FormData=new FormData();
    formData.append("dress_name",d_name);
    formData.append("dress_price",d_price);
    formData.append("description",desc);
    formData.append("imageurl",d_imgurl);
    formData.append("quantity",d_quant);
    return this.http.post<any>(environment.baseUrl+environment.addproducturl,formData);
  }
}
