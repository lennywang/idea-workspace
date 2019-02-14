package com.wincom.dao;


import com.wincom.model.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public UserEntity getUser(Integer uid) {
        Session session=sessionFactory.getCurrentSession();
        UserEntity userEntity = session.get(UserEntity.class, uid);
        return userEntity;
    }

    @Override
    public void saveUser(UserEntity user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
        System.out.println("=="+user.getUname());
    }
}
