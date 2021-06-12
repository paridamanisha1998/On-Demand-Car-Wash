package io.washpackages.Washing_Packages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.*;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.context.annotation.*;
import org.springframework.web.client.*;

@SpringBootApplication
@EnableEurekaClient
public class WashingPackagesApplication {
	@Bean
	@LoadBalanced
    public RestTemplate template(){
    	return new RestTemplate();
	}
	public static void main(String[] args) {

		SpringApplication.run(WashingPackagesApplication.class, args);
	}

}
