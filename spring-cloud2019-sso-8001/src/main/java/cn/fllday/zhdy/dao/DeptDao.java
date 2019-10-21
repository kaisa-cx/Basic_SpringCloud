package cn.fllday.zhdy.dao;


import org.apache.ibatis.annotations.Mapper;

import cn.fllday.zhdy.model.Dept;
import java.util.List;

//
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
