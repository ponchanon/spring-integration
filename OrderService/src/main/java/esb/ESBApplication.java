package esb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ESBApplication implements CommandLineRunner {
	@Autowired
	RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ESBApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Override
	public void run(String... args) throws Exception {
		restTemplate.postForLocation("http://localhost:8080/orders", new Order("334", 120.0,"International"));
		restTemplate.postForLocation("http://localhost:8080/orders", new Order("355", 100.0,"Domestic"));
		restTemplate.postForLocation("http://localhost:8080/orders", new Order("366", 190.0,"Domestic"));
	}
}
