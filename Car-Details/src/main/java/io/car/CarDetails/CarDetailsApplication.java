package io.car.CarDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.*;

@SpringBootApplication
@EnableEurekaClient
public class CarDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarDetailsApplication.class, args);
	}

}
