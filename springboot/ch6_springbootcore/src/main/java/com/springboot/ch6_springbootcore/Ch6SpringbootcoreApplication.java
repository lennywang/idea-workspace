package com.springboot.ch6_springbootcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, CodecsAutoConfiguration.class})
public class Ch6SpringbootcoreApplication {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index() {
        return "book author is " + bookAuthor + ", book name is " + bookName;
    }


    @RequestMapping("/bull")
    String BullSort() {
        String result = "";
        int[] arr = new int[]{1, 5, 3, 9, 2};
        int len = arr.length;
        len = len - 1;
        int i, j, tmp;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int val : arr) {
            result += val + ",";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Ch6SpringbootcoreApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);

        //SpringApplication.run(Ch6SpringbootcoreApplication.class, args);
    }
}
