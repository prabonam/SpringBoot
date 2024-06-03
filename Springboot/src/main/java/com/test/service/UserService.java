/**
 * 
 */
package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repository.UserRepository;

/**
 * @author Prasad_Bonam
 *
 */
@Service
public class UserService {
	@Autowired
	UserRepository repository;
	public String getUserMessage(int userId) {
        // Database access and business logic
        String userName = repository.getUserName(userId);
        return "Hello, " + userName + "!";
    }
}
