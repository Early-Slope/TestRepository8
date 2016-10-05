package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {

	@RequestMapping(value = "/webAccess", method = RequestMethod.GET)
	public String index() {
        return "hello,Hayasaka!!";
    }

}

