package com.atguigu.java;

import java.util.Arrays;

/**
 * @author Ryan
 * @create 2022-03-01 22:45
 */
public class Hello {

    public static void main(String[] args) {


        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello.main");
        int num1=10;
        int num2=20;
        System.out.println("num = " + num1);

        System.out.println(num2);
        String[] arr =new String[]{"1","2","3"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);

        }


    }
}
