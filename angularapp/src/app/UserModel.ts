import {CartModel} from '../app/CartModel'
export class OrderModel{
    email:String;
    password:String;
    username:String;
    mobileNumber:String;
    active:Boolean;
    role:String;
    cart:CartModel;
    ordersList:List<OrderModel>
    constructor(){
        this.email=email;
        this.password=password;
        this.username=username;
        this.mobileNumber=mobileNumber;
        this.active=active;
        this.role=role;
    }
}