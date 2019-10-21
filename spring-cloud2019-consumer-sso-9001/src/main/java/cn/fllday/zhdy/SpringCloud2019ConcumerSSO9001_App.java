package cn.fllday.zhdy;

import cn.fllday.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRING-CLOUD2019-SSO",configuration = MyselfRule.class)
public class SpringCloud2019ConcumerSSO9001_App {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud2019ConcumerSSO9001_App.class,args);
    }
}
