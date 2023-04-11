package com.gaz.app.sb.demomavenapp01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoApi {
	@GetMapping
	public String demo() {
		return "Spring Demo with Maven !!!";
	}
}
