package com.dnb.customerservice.exception;

public class InvalidNameException  extends Exception{
	public InvalidNameException(String msg)
	 {
		 super(msg);
	 }
	 public String toString() {
		 return super.toString()+super.getMessage();
	 }
	}


