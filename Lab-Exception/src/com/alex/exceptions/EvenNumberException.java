package com.alex.exceptions;

public class EvenNumberException extends Exception{
	@Override
	public String getMessage() {
		// input an even number
		// output with custom message
		return "You cannot input an even number.";
	}
}
