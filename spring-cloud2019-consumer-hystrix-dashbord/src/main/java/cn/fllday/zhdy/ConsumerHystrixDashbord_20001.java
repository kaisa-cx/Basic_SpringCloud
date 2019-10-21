package cn.fllday.zhdy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashbord_20001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashbord_20001.class,args);
    }

}
