package com.dnb.customerservice.exception;

public class InvalidDateException extends Exception {
	public InvalidDateException(String msg)
	 {
		 super(msg);
	 }
	 public String toString() {
		 return super.toString()+super.getMessage();
	 }
}
