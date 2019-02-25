package com.ssh.service.web;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.service.ScoreService;
import com.ssh.service.ScoreService;
import ssh.entity.ScoreEntity;

public class ScoreAction extends ActionSupport {
    private Integer id;

    private ScoreEntity scoreEntity;

    private ScoreService scoreService;

    public String getScore(){
        System.out.println("Id:"+id);
        scoreEntity=scoreService.getScore(id);
        System.out.println("Score:"+scoreEntity);
        return SUCCESS;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ScoreEntity getScoreEntity() {
        return scoreEntity;
    }

    public void setScoreEntity(ScoreEntity scoreEntity) {
        this.scoreEntity = scoreEntity;
    }

    public ScoreService getScoreService() {
        return scoreService;
    }

    public void setScoreService(ScoreService scoreService) {
        this.scoreService = scoreService;
    }
}
