package com.msn.sma.lib.util;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReturnResponse{
	
	public ReturnResponse() {
		super();
	}
	public String responseSucces(Boolean result,String message,List list){
		SuccessModel res = new SuccessModel();
		res.setResult(result);
    	res.setMessage(message);
    	res.setList(list);
    	
    	ObjectMapper objectMapper = new ObjectMapper();
		try {
			String json = objectMapper.writeValueAsString(res);
			return json;
		} catch (JsonProcessingException e) {
			return "";
		}
	}
	public String errorException(Boolean result,String message,List list){
		ErrorException res = new ErrorException();
		res.setResult(result);
    	res.setMessage(message);
    	res.setList(list);
    	
    	ObjectMapper objectMapper = new ObjectMapper();
		try {
			String json = objectMapper.writeValueAsString(res);
			return json;
		} catch (JsonProcessingException e) {
			return "";
		}
	}
}
