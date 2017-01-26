package com.goit.core.module11;

import java.io.*;

/**
 * Created by Mala on 1/26/2017.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        checkWord("author");
        checkWord2("for");
    }


    static void checkWord(String word) throws IOException {

        BufferedReader br;
        try {
            FileReader fileReader = new FileReader("/Users/Mala/Desktop/HW11.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        try {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                if (line.contains(word))
                    count++;
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
            System.out.println("Number of particular word: " + count);
        } catch (IOException e) {
            System.err.println("Read failed! ");
        }
    }

    static void checkWord2(String word) {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/Mala/Desktop/HW11.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                if (line.contains(word))
                    count++;
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
            System.out.println("Number of particular word: " + count);
        } catch (IOException e) {
            System.err.println("Read failed! ");
        }
    }
}



