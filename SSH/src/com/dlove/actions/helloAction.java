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
		message="��һ��SS2H��Ŀ�����汾�ĵ���";
		return "success";
	}
}
