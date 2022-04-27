package com.example.demo.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

public class VigoListener implements ApplicationListener<ApplicationEvent> {

  @Override
  public void onApplicationEvent(ApplicationEvent event) {
      System.out.println("event: I am inside here");
  }
  
  @EventListener
  public void doEvent(ApplicationEvent event){
      System.out.println("the event checker ran");
  }
  
}