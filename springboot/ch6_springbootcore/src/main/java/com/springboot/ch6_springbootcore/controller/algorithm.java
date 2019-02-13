package com.springboot.ch6_springbootcore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/algorithm")
public class algorithm {

    @RequestMapping("/getIndex")
    public int getIndex(@RequestParam("arr") int[] arr,@RequestParam("val") int val)
    {
        int min=0;
        int max=arr.length-1;
        int mid=(min+max)/2;
        while (arr[mid]!=val){
            if(arr[mid]<val){
                min=min+1;
            }
            if(arr[mid]>val){
                max=mid-1;
            }
            if(min>max){
                return -1;
            }
            mid=(min+max)/2;
        }
        return mid;
    }

    @RequestMapping("/doWhile")
    public void doWhile()
    {
        int x=10,y=30;
        int index=0;
        do{
            y-=x;
            System.out.println("次数："+index);
            index=index+1;
        }while (x++<y--);
    }

}
