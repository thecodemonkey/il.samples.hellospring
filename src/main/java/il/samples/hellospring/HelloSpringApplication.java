package il.samples.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class HelloSpringApplication{

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void logStartingOfApplication() {
		System.out.println("Started REST-API");
	}

}
