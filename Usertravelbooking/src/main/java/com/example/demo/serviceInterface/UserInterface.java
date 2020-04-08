package com.example.demo.serviceInterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
@Service
public interface UserInterface {

	List<Integer> getAllUserIdList();

	void addUsers(User user);

}
