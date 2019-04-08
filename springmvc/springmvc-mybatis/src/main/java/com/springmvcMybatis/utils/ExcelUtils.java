package com.springmvcMybatis.utils;

import org.apache.poi.hssf.usermodel.*;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ExcelUtils
 * @Description TODO
 * @Author wll
 * @Date 2019/3/31 11:16
 * @Version 1.0
 **/
public class ExcelUtils {
    public static void createExcel(Map<String,List<String>>map,String[] strArray)
    {
        HSSFWorkbook workbook =new HSSFWorkbook();
        HSSFSheet sheet= workbook.createSheet("sheet1");
        sheet.setDefaultColumnWidth(Short.parseShort("20"));
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style =workbook.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);

        HSSFCell cell =null;
        for (int i=0;i<strArray.length;i++){
            cell=row.createCell((short) i);
            cell.setCellValue(strArray[i]);
            cell.setCellStyle(style);
        }

        Integer i=0;
        for (String no:map.keySet())
        {
            row = sheet.createRow(i+1);
            List<String> list  =map.get(no);

            for (int j=0;j<strArray.length;j++)
            {
                row.createCell((short) j).setCellValue(list.get(j));
            }

            try {
                FileOutputStream fileOutputStream =new FileOutputStream("D:/members.xml");
                workbook.write(fileOutputStream);
                fileOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }

    }
}
