package com.mx.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {

	@GetMapping("/")
	public String index() {
		System.out.println("Se realizo una peticion");
		return "Hola mundo desde spring";
	}

}