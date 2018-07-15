package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	Environment env;
	
    @GetMapping("/")
    String home() {
        return "Hello World!";
    }
    
    @GetMapping("/sayHi")
    String sayHi(String name) {
    	return "Hello, "+name;
    }
    
    @GetMapping("/getEnv")
    String getEnv(String name) {
    	return env.getProperty(name);
    }
}
