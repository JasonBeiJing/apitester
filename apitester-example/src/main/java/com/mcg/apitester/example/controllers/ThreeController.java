package com.mcg.apitester.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ThreeController {

	@RequestMapping(value="/three/wait",method=RequestMethod.GET)
	public boolean list(@RequestParam(defaultValue="2000") int wait, @RequestParam(defaultValue="false") boolean error) throws InterruptedException {
		Thread.currentThread().sleep(wait);
		if(error) {
			throw new RuntimeException();
		}
		return false;
	}
	
		
}