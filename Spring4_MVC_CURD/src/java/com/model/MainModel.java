package com.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static javafx.scene.input.KeyCode.T;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class MainModel {

    private JdbcTemplate jdbcTemplate;
//    private  NamedParameterJdbcTemplate  template;
//    private SimpleJdbcTemplate stemplate;  

//    public MainModel(NamedParameterJdbcTemplate template) {
//        this.template = template;
//    }
//
//    public MainModel(SimpleJdbcTemplate stemplate) {
//        this.stemplate = stemplate;
//    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int update(EmployeeBean e) {

        String query = "update employee set name=?,salary=? where id=?";
        return jdbcTemplate.update(query, e.getName(), e.getSalary(), e.getId());

        //String query="update employee set name=?,salary=? where id=?";  
        //return template.update(query,e.getName(),e.getSalary(),e.getId());  
    }

    public int saveEmployee(EmployeeBean e) throws DataAccessException {
        String query = "insert into employee values(" + "'" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
        return jdbcTemplate.update(query);
    }

    public Boolean saveEmployeeByPreparedStatement(EmployeeBean e) {

        String query = "insert into employee values(?,?,?)";

        return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, e.getId());
                ps.setString(2, e.getName());
                ps.setFloat(3, e.getSalary());

                return ps.execute();
            }
        });
    }

//    //NamedParameterJdbcTemplate example
//    public  void save (EmployeeBean e) { 
//        
//        String query="insert into employee values (:id,:name,:salary)";  
//
//        Map<String,Object> map=new HashMap<String,Object>();  
//        
//        map.put("id",e.getId());  
//        map.put("name",e.getName());  
//        map.put("salary",e.getSalary());  
//
//        template.execute(query,map,new PreparedStatementCallback() {  
//            @Override  
//            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {  
//                return ps.executeUpdate();  
//            }  
//        });  
//    } 
    public int updateEmployee(EmployeeBean e) throws DataAccessException {
        String query = "update employee set " + "name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='" + e.getId() + "' ";
        return jdbcTemplate.update(query);
    }

    public int deleteEmployee(EmployeeBean e) throws DataAccessException {
        String query = "delete from employee where id='" + e.getId() + "' ";
        return jdbcTemplate.update(query);
    }

    public int delete(int id) {
        String sql = "delete from employee where id=" + id + "";
        return jdbcTemplate.update(sql);
    }

    public EmployeeBean getEmpById(int id) {
        String sql = "select * from employee where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<EmployeeBean>(EmployeeBean.class));
    }

    public List<EmployeeBean> getAllEmployees() {

        return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<EmployeeBean>>() {
            @Override
            public List<EmployeeBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<EmployeeBean> list = new ArrayList<EmployeeBean>();

                while (rs.next()) {
                    EmployeeBean e = new EmployeeBean();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setSalary(rs.getInt(3));
                    list.add(e);
                }

                return list;
            }
        });
    }

    public List<EmployeeBean> getAllEmployeesRowMapper() {

        return jdbcTemplate.query("select * from employee", new RowMapper<EmployeeBean>() {
            @Override
            public EmployeeBean mapRow(ResultSet rs, int rownumber) throws SQLException {
                EmployeeBean e = new EmployeeBean();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getInt(3));
                return e;
            }
        });
    }

    public List<EmployeeBean> getEmployeesByPage(int pageid, int total) {
        String sql = "select * from employee limit " + (pageid - 1) + "," + total;
        return jdbcTemplate.query(sql, new RowMapper<EmployeeBean>() {
            public EmployeeBean mapRow(ResultSet rs, int row) throws SQLException {
                EmployeeBean e = new EmployeeBean();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getFloat(3));
                return e;
            }
        });
    }

}
