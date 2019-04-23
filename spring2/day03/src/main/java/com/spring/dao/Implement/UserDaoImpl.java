package com.spring.dao.Implement;

import com.spring.bean.User;
import com.spring.dao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/4/19 6:15
 * @Version 1.0
 **/
public class UserDaoImpl implements UserDao {


    JdbcTemplate jdbcTemplate;

    public void save(User user) {
        String sql = "INSERT INTO t_user(name) VALUES(?)";
        jdbcTemplate.update(sql, new Object[]{user.getName()});
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM t_user WHERE id = ?";
        jdbcTemplate.update(sql, new Object[]{id});
    }

    public void update(User user) {
        String sql = "UPDATE t_user SET NAME=? WHERE id =?";
        jdbcTemplate.update(sql, new Object[]{user.getName(), user.getId()});
    }

    public User getById(final Integer id) {
        String sql = "SELECT * FROM t_user WHERE id=?";
        User user = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User u = new User();
                u.setId(resultSet.getInt("id"));
                u.setName(resultSet.getString("name"));
                return u;
            }
        }, new Object[]{id});
        return user;
    }

    public Integer getCount() {
        String sql = "SELECT COUNT(1) FROM t_user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    public List<User> getList() {
        String sql="SELECT * FROM t_user";
        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User u = new User();
                u.setId(resultSet.getInt("id"));
                u.setName(resultSet.getString("name"));
                return u;
            }
        });
        return userList;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
