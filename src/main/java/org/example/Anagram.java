package org.example;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    String seed;
    private Map<Byte, Integer> map = new HashMap<>();

    public Anagram(String s) {
        seed = s;
        transform(s);
    }

    private void transform(String s) {
        for (Byte c : s.toLowerCase().getBytes()) {
            if (Character.isWhitespace(c)) {
                continue;
            }
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
    }

    public boolean compare(Anagram b) {
        return map.equals(b.map);
    }

    public void printAll() {
        printPermutn(seed, "");
    }

    // https://www.geeksforgeeks.org/print-all-permutations-of-a-string-in-java/
    // Function to print all the permutations of str
    private void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
}
