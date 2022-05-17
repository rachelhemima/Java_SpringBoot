package ai.jobiak.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class FirstBootAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstBootAppApplication.class, args);
	}		
	@GetMapping
	public String check() {
	return "Harry Potter";
	}
}
