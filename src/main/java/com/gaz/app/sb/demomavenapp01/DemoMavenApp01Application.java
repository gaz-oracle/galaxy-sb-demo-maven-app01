package com.gaz.app.sb.demomavenapp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;


@SpringBootApplication
public class DemoMavenApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMavenApp01Application.class, args);
	}

}
//Respositorios, servicios, modelos, configuracciones, beans
