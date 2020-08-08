/**
 * <h1>Invalid Token Exception</h1>
 * This exception is called when the value of the product ID or quantity is bad 
 * @author ishaankapoor
 * @version 1.0
 * @since 5th August 2020
 */
package com.onlineRetail.billing.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid Token") 
public class InvalidTokenException extends Exception {
	public InvalidTokenException() {
	}
}
