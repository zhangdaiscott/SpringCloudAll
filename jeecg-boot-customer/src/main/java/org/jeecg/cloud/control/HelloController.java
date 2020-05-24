package org.jeecg.cloud.control;

import org.jeecg.cloud.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class HelloController {
    @Autowired
    private EchoService ecService;

	@RequestMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}