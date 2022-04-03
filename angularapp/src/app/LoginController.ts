import {LoginModel} from '../app/LoginModel'
export class LoginController{
    checkUser(login:LoginModel){
        login.save();
    }
}