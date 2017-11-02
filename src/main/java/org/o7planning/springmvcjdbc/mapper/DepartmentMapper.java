package org.o7planning.springmvcjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.o7planning.springmvcjdbc.model.Department;
import org.springframework.jdbc.core.RowMapper;

public class DepartmentMapper implements RowMapper<Department> {
 
    public static final String BASE_SQL = //
            "Select b.bunny,b.name,b.sex,b.colour "//
                    + " from Bunnies21 b ";
 
    @Override
    public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
    	
        float bunny = rs.getFloat("bunny");
        String name = rs.getString("name");
        String sex = rs.getString("sex");
        String colour = rs.getString("colour");
        
 
        return new Department(bunny, name, sex, colour);
    }
 
}
