package com.shu;

import java.util.HashMap;

public class CharCount {

    public static void getCount(String name) {
        HashMap<String, Integer> charmap = new HashMap<String, Integer>(); 
        char strarray[] = name.toCharArray();

        for (int i = 0; i < strarray.length; i++) {
            char c = strarray[i];

            
            String key = (c == ' ') ? "space" : String.valueOf(c);

            if (charmap.containsKey(key)) {
                charmap.put(key, charmap.get(key) + 1);
            } else {
                charmap.put(key, 1);
            }
        }

        System.out.println(name + ": " + charmap);
    }

    public static void main(String args[]) {
        getCount("shubham kadam patil");
    }
}
