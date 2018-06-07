package my.example.schedulingdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@SpringBootApplication
//@EnableScheduling
public class SchedulingDemoApplication {

/*	@Bean
    public TaskScheduler scheduler(){
		ThreadPoolTaskScheduler t = new ThreadPoolTaskScheduler();
		t.setPoolSize(2);
		t.setThreadNamePrefix("taskScheduler - ");
		t.initialize();
		return t;
	}*/


    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler1() {
        ThreadPoolTaskScheduler threadPoolTaskScheduler
                = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(2);
        threadPoolTaskScheduler.setThreadNamePrefix(
                "ThreadPoolTaskScheduler1 -");
        return threadPoolTaskScheduler;
    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler2() {
        ThreadPoolTaskScheduler threadPoolTaskScheduler
                = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(2);
        threadPoolTaskScheduler.setThreadNamePrefix(
                "ThreadPoolTaskScheduler2 -");
        return threadPoolTaskScheduler;
    }

    public static void main(String[] args) {
        SpringApplication.run(SchedulingDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ScheduleService service, ScheduleService2 service2) {
        return args -> {
            SchedulingDemoApplication.this.threadPoolTaskScheduler1().scheduleAtFixedRate(service::method1, 200);
            SchedulingDemoApplication.this.threadPoolTaskScheduler2().scheduleAtFixedRate(service2::method1, 200);
        };

    }
}
