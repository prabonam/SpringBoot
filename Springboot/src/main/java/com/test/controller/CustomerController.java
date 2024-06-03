/**
 * 
 */
package com.test.controller;

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
public class CustomerController {

@RequestMapping(value = "/customer")
 public @ResponseBody ResponseEntity < Customer > getCustomer() {

  Customer customer = new Customer();
  customer.setName("Java dev demo");
  customer.setAge(30);
  customer.setEmail("contact-us@www.runnerdev.com");

  return new ResponseEntity < Customer > (customer, HttpStatus.OK);
 }

}
