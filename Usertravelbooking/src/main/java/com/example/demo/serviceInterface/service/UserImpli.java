package com.example.demo.serviceInterface.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.serviceInterface.UserInterface;
@Service
public class UserImpli implements UserInterface {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Integer> getAllUserIdList() {
		List<User> userList = userRepository.findAll();
		List<Integer> userId = new ArrayList<Integer>();
		for (User user : userList) {
			userId.add(user.getUserId());
		}
		return userId;
	}

	@Override
	public void addUsers(User user) {
		userRepository.save(user);
		
	}
		
		
	}

	
	


