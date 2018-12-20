package snmaddula.pochub.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringZuulApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulApp.class, args);
	}

}

