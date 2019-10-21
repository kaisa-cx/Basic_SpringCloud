package cn.fllday.zhdy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {

    private long deptno;            // 主键

    private String dname;           // 部门名称

    private String db_source;        // 所在的数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
