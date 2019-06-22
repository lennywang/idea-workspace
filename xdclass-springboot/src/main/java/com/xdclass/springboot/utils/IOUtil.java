package com.xdclass.springboot.utils;

/**
 *
 **/
public class IOUtil {

//    java 读写文件避免乱码
//    https://www.cnblogs.com/first-ykw/p/8856803.html

//    JAVA读取文件里面部分汉字内容乱码
//    https://blog.csdn.net/u013041642/article/details/80368787
//     public static void main(String[] args) throws IOException {
//        ClassLoader classLoader = SysPath.class.getClassLoader();
//        String filePath = classLoader.getResource("").getPath() + "/expect1.txt";
//​
//        System.out.println(filePath);
//​
//        File file = new File(filePath);
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            StringBuffer sb = new StringBuffer();
//            while (br.ready()) {
//                sb.append(br.readLine());
//            }
//            System.out.println(sb);
//        }
//    }
}
