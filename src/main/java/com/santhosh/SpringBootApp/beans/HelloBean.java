package com.santhosh.SpringBootApp.beans;

public class HelloBean {

	private String message;

	public HelloBean() {
	}

	public HelloBean(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
