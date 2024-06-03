/**
 * 
 */
package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.dto.Customer;
import com.test.service.UserService;

/**
 * @author Prasad_Bonam
 *
 */
@RestController
public class UserController {

	@RequestMapping(value = "/user")
	public @ResponseBody ResponseEntity<String> getUserData() {
		UserService userService = new UserService();
		String message = userService.getUserMessage(123);
		System.out.println(message);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
}