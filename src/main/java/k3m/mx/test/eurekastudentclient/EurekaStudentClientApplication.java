package k3m.mx.test.eurekastudentclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaStudentClientApplication.class, args);
	}
}
