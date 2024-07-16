package com.msn.sma.lib.util;

public class SuccessModel<T> {
	private Boolean result;
	private String message;
	private T list;
	
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getList() {
		return list;
	}
	public void setList(T list) {
		this.list = list;
	}
	
}
