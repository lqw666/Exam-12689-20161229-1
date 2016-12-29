package com.spring_mybatis.system.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Context Start");

	}
}