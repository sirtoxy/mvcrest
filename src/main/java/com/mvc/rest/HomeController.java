package com.mvc.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	//curl --header "Accept:application/json" http://localhost:8080/rest/home
	//curl --header "Accept:application/xml" http://localhost:8080/rest/home
	@RequestMapping(value="/home", method=RequestMethod.GET, headers="Accept=application/json, application/xml")
	public @ResponseBody MyObject home() {
		MyObject myObject = new MyObject();
		myObject.name ="aaa";
		myObject.age = 45;
		return myObject;
	}
	
}

