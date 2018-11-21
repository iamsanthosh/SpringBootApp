package com.santhosh.SpringBootApp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.santhosh.SpringBootApp.beans.User;
@Component
public class UserService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Santhosh", new Date()));
		users.add(new User(2, "Hookalike", new Date()));
		users.add(new User(3, "Srinivasa", new Date()));
	}

	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			user.setId(users.size()+1);
		}
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		for(User user:users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}


	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
