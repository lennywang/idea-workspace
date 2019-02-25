package com.ssh.dao.impl;

import com.ssh.dao.ScoreDao;
import com.ssh.dao.ScoreDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import ssh.entity.ScoreEntity;

public class ScoreDaoImpl extends HibernateDaoSupport implements ScoreDao {

    public ScoreEntity getScoreById(Integer id) {
        ScoreEntity scoreEntity= this.getHibernateTemplate().get(ScoreEntity.class,id);
        return scoreEntity;
    }

}
