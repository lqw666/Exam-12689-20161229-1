package com.spring_mybatis.system.model;

public class Logging {
	
	public void beforeAdvice() {
		
		System.out.println("Before Insert Film Data");
		
	}

	
	public void afterAdvice() {
		System.out.println("After Insert Film Data");
	} 
}
