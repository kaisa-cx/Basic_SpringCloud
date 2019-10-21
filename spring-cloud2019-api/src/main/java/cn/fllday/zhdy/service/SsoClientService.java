package cn.fllday.zhdy.service;

import cn.fllday.zhdy.model.Dept;
import cn.fllday.zhdy.model.service.SsoClientServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Description 修改 api 工程。根据已经有的SsoClientService接口
 * 新建一个实现了FallBackFactory接口的类SsoClientServiceFallbackFactory
 */
@FeignClient(value = "SPRING-CLOUD2019-SSO",fallbackFactory = SsoClientServiceFallbackFactory.class)
public interface SsoClientService {

    @RequestMapping(value = "dept/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id")long id);

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);


}
