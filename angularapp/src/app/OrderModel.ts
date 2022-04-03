export class OrderModel{
    orderId:String;
    userId:String;
    ProductName:String;
    quantity:Number;
    totalPrice:String;
    Status:String;
    saveUser(UserModel user){
        user.save();
        return true;
    }
}