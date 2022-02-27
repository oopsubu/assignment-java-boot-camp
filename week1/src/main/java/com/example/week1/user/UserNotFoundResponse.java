package com.example.week1.user;

public class UserNotFoundResponse{
	private String message;

	public UserNotFoundResponse() {
	}

	public UserNotFoundResponse(String message) {
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
}
