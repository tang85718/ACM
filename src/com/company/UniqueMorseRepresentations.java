package com.company;

import java.util.HashSet;

public class UniqueMorseRepresentations {

    String[] symbol = new String[] {".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
    };

    int uniqueMorseRepresentations(String[] words) {

        HashSet<String> set = new HashSet<>();

        for (String word : words) {

            StringBuffer sb = new StringBuffer();
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                sb.append(symbol[idx]);
            }

            set.add(sb.toString());
        }

        return set.size();
    }


    public static void main(String[] args) {
        UniqueMorseRepresentations d = new UniqueMorseRepresentations();
        int ret = d.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"});

        System.out.printf("%d", ret);
    }
}
