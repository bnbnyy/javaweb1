package com.javaweb.java;

import java.util.HashMap;

public class debugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
         HashMap<String,String> map = new HashMap<>();
         map.put("name","Tom");
         map.put("age","18");
         map.put("school","Tsinghua");
         map.put("major","computer");
         String age = map.get("age");
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);
    }
}
