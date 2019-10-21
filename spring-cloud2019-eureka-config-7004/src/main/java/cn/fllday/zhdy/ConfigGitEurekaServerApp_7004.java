package cn.fllday.zhdy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  EurekaServer 服务服务端启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigGitEurekaServerApp_7004 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGitEurekaServerApp_7004.class,args);
    }

}
