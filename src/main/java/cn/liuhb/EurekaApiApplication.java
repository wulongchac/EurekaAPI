package cn.liuhb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApiApplication.class, args);
	}
}
