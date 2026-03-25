package com.linkcode;
import java.util.*;


public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(10);
        obj.add("true");
        obj.add("Hello");
        System.out.println(obj);
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println(obj.get(0));
        System.out.println(obj.contains(20));
        obj.remove(Integer.valueOf(10));
        obj.remove(0);
        System.out.println(obj);


    }
}
