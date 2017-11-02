package org.o7planning.springmvcjdbc.dao;

import java.util.List;

import javax.sql.DataSource;
 
import org.o7planning.springmvcjdbc.mapper.DepartmentMapper;
import org.o7planning.springmvcjdbc.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
@Transactional
public class DepartmentDAO extends JdbcDaoSupport {
 
    @Autowired
    public DepartmentDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
 
    private Float getMaxBunny() {
        String sql = "Select max(b.bunny) from Bunnies21 b";
 
        Float value = this.getJdbcTemplate().queryForObject(sql, Float.class);
        if (value == null) {
            return (float) 0;
        }
        return value;
    }
 
    public Department findDepartment(String name) {
        String sql = DepartmentMapper.BASE_SQL //
                + " where b.bunny = ?";
 
        Object[] params = new Object[] { name };
         
        DepartmentMapper mapper = new DepartmentMapper();
 
        Department dept = this.getJdbcTemplate().queryForObject(sql, params, mapper);
        return dept;
    }
 
    public List<Department> listDepartment() {
        String sql = DepartmentMapper.BASE_SQL;
 
        Object[] params = new Object[] {};
        DepartmentMapper mapper = new DepartmentMapper();
 
        List<Department> list = this.getJdbcTemplate().query(sql, params, mapper);
        return list;
    }
 
    public void insertDepartment(String Bunny, String name, String sex, String colour) {
        String sql = "Insert into Bunnies21 (bunny,name,sex,colour) values (?,?,?,?) ";
        float bunny = this.getMaxBunny() + 1;
        
        Object[] params = new Object[] { bunny,  name, sex, colour };
        this.getJdbcTemplate().update(sql, params);
    }
 
}
