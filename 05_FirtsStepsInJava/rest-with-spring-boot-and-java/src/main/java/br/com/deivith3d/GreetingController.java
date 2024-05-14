package br.com.deivith3d;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting1")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World") 
			String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
    @GetMapping("/greeting")
    public String greeting() {
        return "{\"message\": \"Hello, world!\"}";
    }
    
    @GetMapping("/")
    public String index() {
        return "{\"message\": \"Welcome to the application!\"}";
    }

}
