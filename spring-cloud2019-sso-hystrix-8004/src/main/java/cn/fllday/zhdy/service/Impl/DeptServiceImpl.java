package cn.fllday.zhdy.service.Impl;

import cn.fllday.zhdy.dao.DeptDao;
import cn.fllday.zhdy.model.Dept;
import cn.fllday.zhdy.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        boolean b = deptDao.addDept(dept);
        return b;
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
