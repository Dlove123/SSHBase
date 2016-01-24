package com.dlove.actions;

public class helloAction {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String excute(){
		message="第一个SS2H项目基础版本的调试";
		return "success";
	}
}
