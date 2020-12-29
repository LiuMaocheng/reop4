package com.z1806.util;

import java.io.Serializable;


public class Result implements Serializable{

	private int status;//状态
	
	private String message;//消息
	
	private Object data;//数据
	
	public Result(){}

	public Result(int status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	
	
	
}
