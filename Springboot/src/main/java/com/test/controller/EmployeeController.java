/**
 * 
 */
package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Prasad_Bonam
 *
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.dto.Customer;
 

@RestController
public class EmployeeController {

@RequestMapping(value = "/employee")//GET,POST,UPDATe,delete
public @ResponseBody ResponseEntity < Customer > getCustomer() {	

  Customer customer = new Customer();
  customer.setName("employee dev demo");
  customer.setAge(30);
  customer.setEmail("employee contact-us@www.runnerdev.com");

  return new ResponseEntity < Customer > (customer, HttpStatus.OK);
 }

}
