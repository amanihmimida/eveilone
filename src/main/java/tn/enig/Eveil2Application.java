package tn.enig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Eveil2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eveil2Application.class, args);
	}

}
