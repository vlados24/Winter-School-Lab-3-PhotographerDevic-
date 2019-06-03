package ua.lviv.iot.db1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = {"ua.lviv.iot.db1"})
public class Db1Application {

	public static void main(String[] args) {
		SpringApplication.run(Db1Application.class, args);
	}
	@Bean
	  public CommandLineRunner demo(CameraRepository repository) {      
	    return (args) -> {     
	      repository.save(new Camera(23, 45, Target.CLASSIC_EVENT, "Cannon", "Yes", 44, "8"));
	      
	      repository.findAll().forEach(System.out::println);
	    };  
	  }

}
