package com.devix.company;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("hola.txt");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[^a-zA-Z']+");
            Map<String, Integer> wordCount = new TreeMap<String, Integer>();

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!wordCount.containsKey(word))
                    wordCount.put(word, 1);

                else
                    wordCount.put(word, wordCount.get(word) + 1);

                for (String w : wordCount.keySet()) {
                    System.out.println(w + " " + wordCount.get(word));
                    System.out.println(wordCount.size());
                }
            }
        } catch (IOException e) {
            System.out.println("Unable read from file");
        }


    }

}