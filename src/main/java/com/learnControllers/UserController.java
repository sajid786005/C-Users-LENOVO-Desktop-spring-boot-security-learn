package com.learnControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnModal.User;
import com.learnService.UserService;

@RestController
@RequestMapping("/userr")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	//all User
	
	@GetMapping("/")
	public List<User> getAllUser(){
		return this.userService.getAllUser();
	}
	
	//return single user
	
	@GetMapping("/{username}")
	public User get( @PathVariable ("username")String Username) {
		return this.userService.getUser(Username);
	}
	
	@PostMapping("/")
	public User add(@RequestBody User user) {
		return this.userService.addUser(user);
	}

}
