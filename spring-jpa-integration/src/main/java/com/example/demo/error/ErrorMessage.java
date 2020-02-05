package com.example.demo.error;

public class ErrorMessage {
	private String message;
	private int status;
	private long errorTime;
	
	public ErrorMessage() {
		super();
	}
	public ErrorMessage(String message, int status, long errorTime) {
		super();
		this.message = message;
		this.status = status;
		this.errorTime = errorTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getErrorTime() {
		return errorTime;
	}
	public void setErrorTime(long errorTime) {
		this.errorTime = errorTime;
	}

}
