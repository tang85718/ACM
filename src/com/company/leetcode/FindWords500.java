package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWords500 {

    public static String[] findWords(String[] words) {
        Map<Character, Integer> keyMap = new HashMap<>();
        keyMap.put('q', 1);
        keyMap.put('w', 1);
        keyMap.put('e', 1);
        keyMap.put('r', 1);
        keyMap.put('t', 1);
        keyMap.put('y', 1);
        keyMap.put('u', 1);
        keyMap.put('i', 1);
        keyMap.put('o', 1);
        keyMap.put('p', 1);
        keyMap.put('a', 2);
        keyMap.put('s', 2);
        keyMap.put('d', 2);
        keyMap.put('f', 2);
        keyMap.put('g', 2);
        keyMap.put('h', 2);
        keyMap.put('j', 2);
        keyMap.put('k', 2);
        keyMap.put('l', 2);
        keyMap.put('z', 3);
        keyMap.put('x', 3);
        keyMap.put('c', 3);
        keyMap.put('v', 3);
        keyMap.put('b', 3);
        keyMap.put('n', 3);
        keyMap.put('m', 3);

        List<String> ret = new ArrayList<>();

        for (String w : words) {
            char[] chars = w.toLowerCase().toCharArray();
            int f = keyMap.get(chars[0]);
            boolean ok = true;
            for (int i = 1; i < chars.length; i++) {
                if (f != keyMap.get(chars[i])) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                ret.add(w);
            }
        }

        return ret.toArray(new String[]{});
    }

    public static void main(String[] args) {

        String[] in = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] out = findWords(in);

        for (String s : out) {
            System.out.println(s);
        }
    }
}
