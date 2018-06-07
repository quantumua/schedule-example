package my.example.schedulingdemo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleService {

    //    @Scheduled(fixedRate = 1)
    public void method1() {
        System.out.println(Thread.currentThread().getName() + ": " + this.getClass().getSimpleName() + ": method 1 is executed");
    }

    //    @Scheduled(fixedRate = 2)
    public void method2() {
        System.out.println(Thread.currentThread().getName() + ": " + this.getClass().getSimpleName() + " method 2 is executed");
    }
}
