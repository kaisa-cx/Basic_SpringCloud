package cn.fllday.zhdy.service;

import cn.fllday.zhdy.model.Dept;
import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
