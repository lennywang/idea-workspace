package com.springboot.ch6_springbootcore.utils;

import java.io.*;

public class FileUtils {

    private final static String initContent = "aaa";

    public static String readFile(String fileName) {
        String fileContent;
        BufferedReader reader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                File fileParent = file.getParentFile();
                if (!fileParent.exists()) {
                    fileParent.mkdirs();
                }
                file.createNewFile();
            }
            reader = new BufferedReader(new FileReader(file));
            String tmpStr;
            while ((tmpStr = reader.readLine()) != null) {
                stringBuilder.append(tmpStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        fileContent = stringBuilder.toString();
        fileContent = (fileContent == null || fileContent.equals("")) ? initContent : fileContent;
        return fileContent;
    }

    public static void writeFile(String fileName, String content) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
