import { analyzeAndValidateNgModules } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
@Component({
  selector: 'add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  get d_name()
  {
    return this.addproduct.get('d_name');
  }
  get
// addproduct=new FormGroup({
//   d_name: new FormControl(''),
//   d_price:new FormControl(''),
//   d_desc:new FormControl(''),
//   img:new FormControl(''),
//   quant:new FormControl('')
// });
  constructor(private fb:FormBuilder) { }
    addproduct = this.fb.group({
      d_name :['',Validators.required],
      d_price:[''],
      d_desc:[''],
      img:[''],
      quant:['']

    });

  ngOnInit():void{
   
    }

}
