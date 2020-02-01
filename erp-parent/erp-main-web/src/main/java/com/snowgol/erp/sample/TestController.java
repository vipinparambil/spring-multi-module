package com.snowgol.erp.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/test")
	public String onReady() {
		return "Comming Soon...!!!";
	}

}
