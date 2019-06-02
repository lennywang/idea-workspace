package com.spring.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @ClassName AccountDaoImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/4/27 22:27
 * @Version 1.0
 **/
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public void increaseMoney(Integer id, Double money) {
        getJdbcTemplate().update("UPDATE t_account SET money=money+? WHERE id=2",  money,id);
    }

    public void decreaseMoney(Integer id, Double money) {
        getJdbcTemplate().update("UPDATE t_account SET money=money-? WHERE id=?", money,id);
    }
}
