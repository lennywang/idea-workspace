package com.ssh.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssh.entity.ScoreEntity;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-dao.xml")
public class ScoreDaoTest {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Test
    public void getScore() {
        Configuration conf = new Configuration().configure();

        SessionFactory sf = conf.buildSessionFactory();

        Session session = sf.openSession();

        String sql = "SELECT * FROM score WHERE ID=4";

        //HQL
        //        String hql="from ScoreEntity";
        //        Query query= session.createQuery(hql);
        //        List<ScoreEntity> list = query.list();
        //        System.out.println(list);


        //Criteria
        //        Criteria criteria = session.createCriteria(ScoreEntity.class);
        //        List<ScoreEntity> list = criteria.list();
        //        System.out.println(list);

        //ScoreEntity scoreEntity= (ScoreEntity) session.createSQLQuery(sql).uniqueResult();
        //SQLQuery
        //        ScoreEntity scoreEntity = (ScoreEntity) session.createSQLQuery(sql).addEntity(ScoreEntity.class).uniqueResult();
        //        System.out.println(scoreEntity);

    }
}