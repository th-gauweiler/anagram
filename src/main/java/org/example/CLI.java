package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class CLI {

    Historie historie = new Historie();

    public void start() {
        System.out.println("switched to interactive mode");
        help();
        interact();
    }

    private void help() {
        System.out.println("use f1 to check if two words are anagram, e.g. f1 ( 'ab' , 'ba' )");
        System.out.println("use f2 to get historical anagrams of a word, e.g. f2 ( 'ab' )");
        System.out.println("use blanks for separate the tokens as shown above!");
        System.out.println("use exit to terminate the program");
    }

    private void interact() {
        Scanner scan = null;
        while (true) {
            System.out.print(">");
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
            try {
                String line = reader.readLine();
                scan = new Scanner(line);
                scan.useDelimiter(" ");
                scan.tokens();
                switch (scan.next()) {
                    case "exit":
                        return;
                    case "f1": // eg f1 ( 'abc' , 'def' )
                        scan.next(); // (
                        String arg1 = scan.next(); // 'abc'
                        String word1 = arg1.substring(1, arg1.length() - 1); // abc
                        scan.next(); // ,
                        String arg2 = scan.next(); // 'def'
                        String word2 = arg2.substring(1, arg2.length() - 1); // def
                        scan.next(); // )
                        compareAnagram(historie, word1, word2);
                        break;
                    case "f2": // eg f2 ( 'abc' )
                        scan.next(); // (
                        String arg = scan.next(); // 'abc'
                        String word = arg.substring(1, arg.length() - 1); // abc
                        scan.next(); // )
                        historyOf(word);
                        break;
                }
            } catch (RuntimeException e) {
                help();
            } catch (IOException e) {
                help();
                throw new RuntimeException(e);
            } finally {
                if (scan != null) scan.close();
            }
        }
    }

    public void compareAnagram(Historie historie, String word1, String word2) {
        String result = (new Anagram(historie, word1).compare(new Anagram(historie, word2)))
                ? "" : "not ";
        System.out.println(String.format("%s and %s are %sanagrams",
                word1, word2, result)
        );
    }

    public void historyOf(String word) {
        List<String> anagrams = historie.listFor(word);
        String wordlist = anagrams.toString();
        System.out.println(String.format("f2(%s) = %s", word, wordlist));
    }
}
