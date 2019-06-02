package com.bwj.springboot02.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * @ClassName ElConfig
 * @Description TODO
 * @Author wll
 * @Date 2019/5/22 1:29
 * @Version 1.0
 **/
@Configuration
@ComponentScan("com.bwj.springboot02")
@PropertySource("classpath:com/bwj/springboot02/el/test.properties")
public class ElConfig {

    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private Double randomNuber;

    @Value("{demoService.anthor}")
    private String fromAnthor;

    @Value("classpath:com/bwj/springboot02/el/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment enviroment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNuber);
            System.out.println(fromAnthor);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(enviroment.getProperty("book.author"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
