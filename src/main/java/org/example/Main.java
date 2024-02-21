package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Anagram!");

        if (args.length < 1) {
            printUsage();
            System.exit(0);
        }
        CLI cli = new CLI();
        switch (args[0]) {
            case "compare":
                cli.compareAnagram(null, args[1], args[2]);
                break;
            case "printAll":
                System.out.println(String.format("all anagrams for %s:", args[1]));
                new Anagram(args[1]).printAll();
                break;
            case "cli":
                cli.start();
                break;
            default:
                printUsage();
        }
    }

    public static void printUsage() {
        System.out.println("usage examples:");
        System.out.println("compare aab abb");
        System.out.println("compare aab aba");
        System.out.println("compare regal lager");
        System.out.println("printAll aab");
        System.out.println("cli");
    }
}