package ch2.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

public class ElConfig {

    @Value("I love you!")
    private String normal;

    @Value("#{systemProperties['os.name']")
    private String oName;

    @Value("#T(java.lang.Math).random()*100.0")
    private double randomNumber;

    @Value("#{demoService.another")
    private String fromAnother;

    //D:\Program Data\IdeaProjects\springboot\2_scope\src\main\java\ch2
    @Value("classpath:ch2/springel/test.txt")
    private Resource testFile;



}
