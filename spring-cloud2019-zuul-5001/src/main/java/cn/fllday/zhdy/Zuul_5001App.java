package cn.fllday.zhdy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_5001App {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_5001App.class,args);
    }
}
