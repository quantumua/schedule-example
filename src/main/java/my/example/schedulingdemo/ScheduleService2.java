package my.example.schedulingdemo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ScheduleService2 {

//    @Scheduled(fixedRate = 1)
    public  void method1(){
        System.out.println(Thread.currentThread().getName() + ": "+ this.getClass().getSimpleName() + ": method 1 is executed");
    }

//    @Scheduled(fixedRate = 2000)
    public void method2() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println(Thread.currentThread().getName() + ": "+ this.getClass().getSimpleName() +": method 2 is executed");
    }
}
