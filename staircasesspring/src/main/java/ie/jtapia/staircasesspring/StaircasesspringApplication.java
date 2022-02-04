package ie.jtapia.staircasesspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ie.jtapia.staircasesspring*")
public class StaircasesspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaircasesspringApplication.class, args);
	}

}
