package com.dragisa.sevice;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.dragisa.model.User;
@Service
public class UserService {
	HashMap<String,String> useri=new HashMap<String,String>();
	public UserService(){
		useri.put("a1b1","andra");
		useri.put("a1b2","lazar");
		useri.put("a1b3","dragisa");
	}
	public boolean checkUserInDatabase(User user) {
		
		return useri.get(user.getUsPassword())!=null &&
				useri.get(user.getUsPassword()).equals(user.getUserName());
			}
		
	
		
		
	

}
