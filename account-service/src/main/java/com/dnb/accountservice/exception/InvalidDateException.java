package com.dnb.accountservice.exception;

public class InvalidDateException extends Exception {
	public InvalidDateException(String msg)
	 {
		 super(msg);
	 }
	 public String toString() {
		 return super.toString()+super.getMessage();
	 }
}
