package com.springboot.ch6_springbootcore;

import com.springboot.ch6_springbootcore.utils.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;

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

        //I/0
        // StringBufferInputStream
        // FileDescriptor
        // BufferedReader
        // FileReader
        //String filePath = "D:\\est.txt\\st.txt";
        //String content = FileUtils.readFile(filePath);
        //System.out.println(content);
        //FileUtils.writeFile(filePath, content);

        //Map

        //String
        //equalTest();

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

    private void equalTest() {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);//true (×)    //false （✔）
        System.out.println(s1 == s5);//true
        System.out.println(s1 == s6);//false
        System.out.println(s1 == s6.intern());//false (×)      //true （✔）
        System.out.println(s2 == s2.intern());//true (×)       // （✔）
    }

//    private void writeFile(String filePath, String content) {
//        try {
//            FileWriter writer = new FileWriter(filePath, true);
//            writer.write(content);
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private String readFile(String filePath) {
//        String fileContent;
//        File file = new File(filePath);
//        BufferedReader reader = null;
//        StringBuilder builder = new StringBuilder();
//        try {
//            if (!file.exists()) {
//                File fileParent= file.getParentFile();
//                if(!fileParent.exists()){
//                    fileParent.mkdirs();
//                }
//                file.createNewFile();
//
//            }
//            reader = new BufferedReader(new FileReader(file));
//            String tmpStr;
//            if ((tmpStr = reader.readLine()) != null) {
//                builder.append(tmpStr);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        fileContent = builder.toString();
//        fileContent = (fileContent == null ||fileContent.equals(""))  ? "aaa" : fileContent;
//
//
//        return fileContent;
//    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Ch6SpringbootcoreApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);

        //SpringApplication.run(Ch6SpringbootcoreApplication.class, args);
    }
}

