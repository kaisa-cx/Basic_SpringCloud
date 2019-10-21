package cn.fllday.zhdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloud2019ConcumerSSOFeign9001_App {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud2019ConcumerSSOFeign9001_App.class,args);
    }
}
