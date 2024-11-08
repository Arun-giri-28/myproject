package com.webapp;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchController1 {
@GetMapping(value="/getWatch1")
public List<Watch1> getWatch1(@RequestBody List<Watch1> w){
	//stream method
     //return w.stream().filter(x->x.getprice()>1500).collect(Collectors.toList());
	
	//Q1
	//for loop
	ArrayList<Watch1> x=new ArrayList<>();
	for(int i=0;i<w.size();i++){
	if(w.get(i).getprice()>1500) {
		x.add(w.get(i));
	}
	}
	return x;
}
	//Q2
	@GetMapping(value="/getmax")
	public String getmax(@RequestBody List<Watch1> e){
	Watch1 max=e.get(0);
	for(int i=0;i<e.size();i++) {
		if(e.get(i).getprice()>max.getprice()) {
			max=e.get(i);
		}
	}
	return max.getid()+" "+max.getbrand()+" "+max.getprice();
	}
	//Q3
	@GetMapping(value="/getbrand")
	public List<String> getbrand(@RequestBody List<Watch1> r) {
		return r.stream().map(x->x.getbrand()).collect(Collectors.toList());
	}
	
	//Q4
	@GetMapping(value="/getbrandlen")
	public ArrayList<Watch1> getbrandlen(@RequestBody List<Watch1> t) {
		ArrayList<Watch1> u=new ArrayList<>();

		for(int i=0;i<t.size();i++) {
			if(t.get(i).getbrand().length()>5) {
				u.add(t.get(i));
			}
		}
		return  u;
	}
	
	//Q5
	@GetMapping(value="/getbrandd")
	public String getbrandd(@RequestBody List<Watch1> a) {
		//ArrayList<Watch1> u=new ArrayList<>();
		Watch1 max=a.get(0);
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getbrand().length()<max.getbrand().length()) {
				max=a.get(i);
			}
		}
		return max.getid()+" "+max.getbrand()+" "+max.getprice();
		}
	
}

