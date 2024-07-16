package com.msn.sma.lib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.msn.sma.lib.controller.MethodRest;
import com.msn.sma.lib.util.Param;

@SpringBootApplication
public class MsnSmaLibApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsnSmaLibApplication.class, args);
		Param.getInstance();
		System.out.println(""+Param.getVersion());
		
		
		try {
			MethodRest ob = new MethodRest();
			System.out.println("=========ss=======|||"+ob.getLogin());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
