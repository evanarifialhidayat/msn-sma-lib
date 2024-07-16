package com.msn.sma.lib.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.msn.sma.lib.model.ModelExample;
import com.msn.sma.lib.util.ParamKey;
import com.msn.sma.lib.util.ReturnResponse;

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MethodRest {
	  private List datajson = null;
	  private Response response = null;
	  
	  public MethodRest(){super();}
	 
	  public String getLogin(){
		     
			 
			    try{
			    	  OkHttpClient client = new OkHttpClient();
					  datajson = new ArrayList(); 
					  
					  Request request = new Request.Builder()
						        .url(ParamKey.url_example)
						        .build();
			    	  response = client.newCall(request).execute();
    //			      if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
	//			      Headers responseHeaders = response.headers();
	//			      for (int i = 0; i < responseHeaders.size(); i++) {
	//			        System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
	//			      }				      
				      ObjectMapper om = new ObjectMapper();
				      String jsonData = response.body().string();
				      for (ModelExample obj : (ModelExample[]) om.readValue(jsonData, ModelExample[].class)) {
			              datajson.add(new ModelExample(obj.name, obj.language, obj.id, obj.bio, obj.version));
			              break;
			          }
				    return new ReturnResponse().responseSucces(true,ParamKey.succes, datajson);
			    }catch (Exception e) {
			    	return new ReturnResponse().errorException(false,ParamKey.error, datajson);
				}
			    
			   
//		  return response.body().toString();
	  }
}
