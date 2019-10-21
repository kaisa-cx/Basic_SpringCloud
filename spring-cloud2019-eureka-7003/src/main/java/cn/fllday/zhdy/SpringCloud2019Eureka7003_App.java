package cn.fllday.zhdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer                   //  开启eureka服务启动
public class SpringCloud2019Eureka7003_App {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud2019Eureka7003_App.class,args);
    }

}
