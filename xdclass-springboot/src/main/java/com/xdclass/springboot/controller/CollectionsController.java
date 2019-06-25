package com.xdclass.springboot.controller;

import com.xdclass.springboot.domain.SortA;
import com.xdclass.springboot.domain.SortB;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/collections")
public class CollectionsController {

    @RequestMapping("/t1")
    private void test1(){
        //第一种方法示例：
        List<String> lists = new ArrayList<String>();
        lists.add("5");
        lists.add("2");
        lists.add("9");
        //lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序
        Collections.sort(lists);

        //第一种方法示例：
        List<SortA> listA = new ArrayList<SortA>();
        SortA a1 = new SortA();
        a1.setName("a");
        a1.setOrder(2);
        SortA a2 = new SortA();
        a2.setName("b");
        a2.setOrder(1);
        SortA a3 = new SortA();
        a3.setName("c");
        a3.setOrder(5);
        listA.add(a1);
        listA.add(a2);
        listA.add(a3);
        //list中的对象A实现Comparable接口
        Collections.sort(listA);

        System.out.println(lists);//[2, 5, 9]
        System.out.println(listA);//[name:c--order:5, name:a--order:2, name:b--order:1]
    }

    @RequestMapping("/t2")
    private void test2(){
        //第一种方法示例：
        List<String> lists = new ArrayList<String>();
        lists.add("5");
        lists.add("2");
        lists.add("9");
        //lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序
        Collections.sort(lists);

        //第一种方法示例：
        List<SortB> listB = new ArrayList<SortB>();
        SortB a1 = new SortB();
        a1.setName("a");
        a1.setOrder(2);
        SortB a2 = new SortB();
        a2.setName("b");
        a2.setOrder(1);
        SortB a3 = new SortB();
        a3.setName("c");
        a3.setOrder(5);
        listB.add(a1);
        listB.add(a2);
        listB.add(a3);
        //list中的对象A实现Comparable接口
        //Collections.sort(lists);
        Collections.sort(listB, new Comparator<SortB>() {
            public int compare(SortB s1, SortB s2) {
                /**
                 * 升序排的话就是第一个参数.compareTo(第二个参数);
                 * 降序排的话就是第二个参数.compareTo(第一个参数);
                 */
                return s2.getOrder().compareTo(s1.getOrder());
            }

        });

        System.out.println(lists);//[2,5,9]
        System.out.println(listB);//[name:c--order:5, name:a--order:2, name:b--order:1]
    }

}
