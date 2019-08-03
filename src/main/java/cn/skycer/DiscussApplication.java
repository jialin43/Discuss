package cn.skycer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.skycer.controller")
public class DiscussApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscussApplication.class, args);
	}

}
