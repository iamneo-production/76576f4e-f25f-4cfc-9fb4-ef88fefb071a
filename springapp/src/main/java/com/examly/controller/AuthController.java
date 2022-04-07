package com.examly.springapp.controller;

import java.util.*;
import java.lang.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;
import com.examly.springapp.model.UserModel;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.service.UserService;

@RestController
public class AuthController  {
	
	@Autowired
	private UserService service;

	@PostMapping("/signup")
	public String saveUser(@RequestBody UserModel user) throws Exception {
		String tempEmail = user.getEmail();
		if(tempEmail != null && !"".equals(tempEmail)) {
			UserModel userObj= service.fetchUserByEmail(tempEmail);
			if(userObj != null) {
				throw new Exception("Email already exist");
			}
		}
		user.setRole("user");
		service.saveUser(user);
		return ("signed up sucessfully");
	}
	
	@CrossOrigin(origins="https://8081-abcecdbaddefbbfabdfdcbaddedebfabe.examlyiopb.examly.io/")
	@PostMapping("/login")
	public UserModel loginUser (@RequestBody UserModel user) throws Exception {

		String tempEmail = user.getEmail();
		
		String tempPass = user.getPassword();
		
		UserModel userobj = null;
		
		if (tempEmail != null && tempPass != null) 
		{ 
			userobj = service.fetchByEmailAndPassword (tempEmail, tempPass); 
		}
		if(userobj == null){
			throw new Exception("Cannot find the user");
		}
		
		return userobj;
		
	}

}













// package com.examly.springapp.controller; 

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RestController;

// @CrossOrigin(origins="*")
// @RestController
// public class LoginController {
//     private static final String LOGIN_EMAIL_PASSWORD = "/login/{email}&{password}";
//     @Autowired
//     private UserService userService;

//     @GetMapping("/login/{email}&{password}")
// 		 public String existsByemailAndPassword(  @PathVariable String email , @PathVariable String password) {
// 			return(userservice.existsByemailAndpassword(email,password));
				
// 		}
    

    
//}
