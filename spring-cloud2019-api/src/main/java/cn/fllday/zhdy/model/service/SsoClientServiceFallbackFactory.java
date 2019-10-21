package cn.fllday.zhdy.model.service;

import cn.fllday.zhdy.model.Dept;
import cn.fllday.zhdy.service.SsoClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SsoClientServiceFallbackFactory implements FallbackFactory<SsoClientService> {

    @Override
    public SsoClientService create(Throwable throwable) {
        SsoClientService ssoClientService = new SsoClientService() {
            @Override
            public Dept get(long id) {
                Dept dept = new Dept("该ID" + id + "没有对应的信息，Consumer客户端提供的降级信息，此刻服务暂停。");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
        return ssoClientService;
    }
}
