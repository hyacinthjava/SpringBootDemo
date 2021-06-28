package com.example.springboot.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.*;
public class MapTest {
    public static void main(String[] args){
        Map<String,Object> map = new HashMap<>();
        map.put("1","2");
        map.put("2",null);
        String mess1= map.get("1").toString();
//        String mess2 = map.get("2")+"";
//        String mess2 =(String) map.get("2");
        String mess2 = String.valueOf(map.get("2"));
//        String
        List<String> list = new ArrayList<>();
        list.add(mess2);
        list.add(mess1);
        System.out.println(list);
        System.out.println(mess2);
    }

}
