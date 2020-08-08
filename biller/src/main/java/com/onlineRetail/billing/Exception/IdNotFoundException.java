/**
 * <h1> Id Not Found Exception</h1>
 * This class refers to the error in case a Product ID is mentioned that is unavailable 
 * in the database
 * @author ishaankapoor
 * @version 1.0
 * @since 5th August 2020
 */
package com.onlineRetail.billing.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Id") 
public class IdNotFoundException extends RuntimeException {
public IdNotFoundException(Integer id) {
	System.out.println("Sorry ! The Product Code "+id+" is not available.");
}
public IdNotFoundException(String s) {
	System.out.println(s);	
}
}
