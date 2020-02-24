package com.avinash.rathod.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * This annotaion tells the spring container that this is the rest controller.
 *
 */
@RestController
public class HelloController {

	/**
	 * 
	 * This annotaion maps the method with the given request url.
	 * It supports Get method by default.
	 * By the following sayHello method is mapped to /hello.
	 * when any one hit the url /hello the sayHello method will get executed.
	 */
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello world";
	}
}
