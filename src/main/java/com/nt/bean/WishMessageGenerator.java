package com.nt.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	private LocalDateTime ldt;
	
	@Autowired
	public void setLdt(LocalDateTime ldt) {
		System.out.println("WishMessageGenerator.setLdt()");
		System.out.println("Time is "+ldt);
		this.ldt=ldt;
	}
	
	public String generateMessage(String user) {
		int hour=ldt.getHour();
		
		if(hour<12 && hour>4) {
			return "Good Morning "+user;
		}else if(hour<16) {
			return "Good Afternoon "+user;
		}else if(hour<20) {
			return "Good Evening "+user;
		}else {
			return "Good Night "+user;
		}
	}

}
