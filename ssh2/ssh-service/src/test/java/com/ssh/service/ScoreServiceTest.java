package com.ssh.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ssh.entity.ScoreEntity;

import static org.junit.Assert.*;

public class ScoreServiceTest {

    @Test
    public void getScore() {
        // System.out.println(scoreService);
        try {
            ScoreService scoreService = new ScoreService();
            ScoreEntity scoreEntity= scoreService.getScore(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}