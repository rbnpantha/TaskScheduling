package rbn.edu.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduledTasks {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	@Scheduled(fixedRate = 10000)
	public void sendMailToCustomers() {

		System.out.println("sendMailToCustomers Job ran at " + dateFormat.format(new Date()));

	}
}
