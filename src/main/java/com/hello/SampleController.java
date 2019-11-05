package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.business.Stuffy;

@Controller
public class SampleController {
	
	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "Hello World!!";
	}
	
	@RequestMapping("/world")
	public @ResponseBody String world() {
		return "Hello Java Bootcamp World!!";
	}
	
	@RequestMapping("/stuffy")
	public @ResponseBody Stuffy helloStuffy() {
		
		Stuffy s = new Stuffy(1, "whale", "blue", "XL", 2);
		return s;
	}
	
}
