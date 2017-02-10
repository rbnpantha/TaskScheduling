package rbn.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({ "rbn.edu.tasks" })
public class TaskSchedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskSchedularApplication.class, args);
	}
}
