package com.springbootstarter.genericService.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springbootstarter.genericService.genericService;
import com.springbootstarter.user.User;
import com.springbootstarter.userDTO.userDTO;

@Service
public class genericServiceImpl implements genericService {

	private List<User> users = new ArrayList<>(Arrays.asList(
			new User(1, "Atharv", 9766),
			new User(2, "ABC", 1234),
			new User(3, "XYZ", 1234)
			));
	
	public List<User> getUserList() {
		return users;
	}

	@Override
	public Optional<User> getUserById(int id) {
		
		return users.stream().filter(u -> u.getID()==id ).findFirst();
	}

	@Override
	public boolean addUser(userDTO user) {
		User u = new User();
		u.setID(user.getID());
		u.setName(user.getName());
		u.setContactNo(user.getContactNo());

		return ( users.add(u) );
		
	}

	@Override
	public boolean updateUser(userDTO user, int id) {
		boolean flag = false;
		
		for(int i=0; i<users.size(); i++) {
			User u = users.get(i);
			if(u.getID() == id) {
				u.setContactNo(user.getContactNo());
				u.setName(user.getName());
				flag=true;
			}
		}
		
		return flag;
	}

	@Override
	public boolean deleteUser(int id) {
		boolean flag = false;
		flag = users.removeIf(u -> u.getID() == id);
		return flag;
	}

}
