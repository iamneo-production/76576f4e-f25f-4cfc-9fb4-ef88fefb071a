package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class LoginModel {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="email",unique= true,nullable = false)
	private String email;

	@Column(name = "password")
	private String password;
	
	public LoginModel () {
		
	}
	
	public LoginModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}






































// package com.examly.springapp.model;

// import java.util.Objects;

// import javax.persistence.Entity;
// import javax.persistence.Id;

// @Entity

// public class LoginModel {
//     @Id
//     private String email;

//     private String password;

//     LoginModel(){}
//     LoginModel(String email,String password){
//         this.email = email;
//         this.password = password;
//     }

//     public void setEmail(String email){
//         this.email = email;  
//     }

//     public void setPassword(String password){
//         this.password = password;
//     }

//     public String getEmail(){
//         return this.email;
//     }

//     public String getPassword(){
//         return this.password;
//     }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (!(o instanceof UserModel)) return false;
    //     LoginModel user = (LoginModel) o;
    //     return Objects.equals(password, user.getPassword()) &&
    //             Objects.equals(email, user.getEmail());
    // }

//}
    

