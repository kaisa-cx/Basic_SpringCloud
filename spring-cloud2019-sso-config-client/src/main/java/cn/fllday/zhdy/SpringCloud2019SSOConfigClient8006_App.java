package cn.fllday.zhdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient    // 开启客户端注册进入到erureka服务中
@EnableDiscoveryClient   // 服务发现
public class SpringCloud2019SSOConfigClient8006_App {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud2019SSOConfigClient8006_App.class,args);
    }
}
