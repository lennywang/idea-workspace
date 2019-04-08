package com.springmvcMybatis.utils;

import com.springmvcMybatis.domain.Member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DownloadExcel
 * @Description TODO
 * @Author wll
 * @Date 2019/3/29 22:21
 * @Version 1.0
 **/
public class DownloadExcel {

    private static Map<String,List<String>> getMember()
    {
        List<Member> list =new ArrayList<Member>();
        Map<String,List<String>> map =new HashMap<String, List<String>>();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd");
        try {
            Member member =new Member("1","熊大",24,simpleDateFormat.parse("1993-08-28"));
            Member member2 =new Member("2","熊二",24,simpleDateFormat.parse("1994-08-28"));
            Member member3 =new Member("3","光头强",24,simpleDateFormat.parse("1994-08-28"));

            list.add(member);
            list.add(member2);
            list.add(member3);

            for (int i=0;i<list.size();i++){
                ArrayList<String> members =new ArrayList<String>();
                members.add((list.get(i)).getCode());
                members.add(list.get(i).getName());
                members.add(list.get(i).getAge()+"");
                members.add(simpleDateFormat.format(list.get(i).getBirth()));

                map.put(list.get(i).getCode(),members);
            }
        }catch (ParseException expection){
            expection.printStackTrace();
        }
        return map;
    }

    private static String[] excelTitle(){
        String[] strArray ={"学号","姓名","年龄","生日"};
        return strArray;
    }
}
