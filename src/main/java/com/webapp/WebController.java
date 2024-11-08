package com.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
@GetMapping(value="/gethello")
public String get() {
	return "hello";
}
@GetMapping(value="/getName/{a}")
public String getName(@PathVariable String a) {
	return "Hello "+a;
}  
@GetMapping(value="/getadd/{a}/{b}")
public int getadd(@PathVariable int a, @PathVariable int b) {
	return a+b;
}
@GetMapping(value="/great")
public  String findGreatest(@RequestParam int num1,@RequestParam int num2) {
	if(num1>num2) {
		return "the Greatest number is "+num1;
	}
	else {
		return"the Greatest number is "+num1;
	}
}
@GetMapping(value="/login")
public String id(@RequestParam String UserName ,@RequestParam String password) {
	if(UserName.equals("abc") && password.equals("123")) {
		 
		return "Success";
	}
	else {
		return "Not Match";
	}
}



















//using @pathvariable//

//@GetMapping(value="/great/{num1}/{num2}")
//public  String findGreatest(@PathVariable int num1,@PathVariable int num2) {
//	if(num1>num2) {
//		return "The Greatest number is "+num1;
//	}
//	else {
//		return"The Greatest number is "+num2;
//	}
//}
}
