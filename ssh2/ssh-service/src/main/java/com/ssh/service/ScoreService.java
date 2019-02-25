package com.ssh.service;

import com.ssh.dao.ScoreDao;
import com.ssh.dao.ScoreDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssh.entity.ScoreEntity;

@Service
public class ScoreService {

    private ScoreDao scoreDao;

    public ScoreEntity getScore(Integer id) {

        ScoreEntity scoreEntity = scoreDao.getScoreById(id);
        return scoreEntity;
    }

    public ScoreDao getScoreDao() {
        return scoreDao;
    }

    public void setScoreDao(ScoreDao scoreDao) {
        this.scoreDao = scoreDao;
    }
}
