package com.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchController {
@GetMapping(value="/getWatch")
public Watch getWatch(@RequestBody Watch w) {
	return w;
}
}
class Watch {
	private int id;
	private String brand;
	private int price;
	
	public void setid(int a) {
		 id=a;
	}
	public int getid() {
		return id ;
	}
	public void setbrand(String b) {
		 brand=b;
	}
	public String getbrand() {
		return brand;
	}
	public void setprice(int c) {
		 price=c;
	}
	public int getprice() {
		return price;
	}
}