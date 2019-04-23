package com.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName SettingProperty
 * @Description TODO
 * @Author wll
 * @Date 2019/4/21 21:09
 * @Version 1.0
 **/
@Component("settingProperty")
public class SettingProperty {

    @Value("#{setting[author_name]}")
    private String authorName;

    @Value("#{setting[project_info]}")
    private String projectInfo;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }
}
