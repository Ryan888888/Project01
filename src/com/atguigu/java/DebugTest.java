package com.atguigu.java;

import java.util.HashMap;

/**
 * @author Ryan
 * @create 2022-03-03 20:11
 */
public class DebugTest {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }



        HashMap<String, String> map = new HashMap<>();
        map.put("name","TOM");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","conputer");
        String age= map.get("age");
        System.out.println(age);

        map.remove("majior");
        System.out.println(map);


    }

}
