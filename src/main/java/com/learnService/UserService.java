package com.learnService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learnModal.User;

@Service
public class UserService {
	List<User> list=new ArrayList<>();

	public UserService(List<User> list) {
		super();
		list.add(new User("Abbas","Abbas786","Abbas@gmail.com"));
		list.add(new User("rizve","Rizvi786","Rizvi@gmail.com"));
	}
	//get all User
	
	public List<User>getAllUser(){
		return this.list;
	}
//get singel user
	
	public User getUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().get();
	}
	//add new User
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
