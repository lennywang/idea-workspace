package com.spring.service;

import com.spring.dao.AccountDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/4/27 22:59
 * @Version 1.0
 **/
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = true)
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    private TransactionTemplate transactionTemplate;

    public void transfer(Integer from, Integer to, Double money) {
        accountDao.decreaseMoney(from,money);

        accountDao.increaseMoney(to,money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
