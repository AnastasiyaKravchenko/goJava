package com.goit.core.module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Mala on 1/25/2017.
 */
public class FilesHW {
    public static void main(String[] args) throws IOException {
//        reading file
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/Mala/Desktop/HW11.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String text = sb.toString();
            System.out.println("Read file: " + text);

            Map<String, String> map = new HashMap<>();
//            replacer(text, map);
//            fileContentReplacer(text, map);
            fileContentMerger(text);
        }catch (IOException e){
            System.err.println("Read failed! ");
        }

    }


    static String replacer(String text, Map<String, String> map) throws IOException {
        String replacedText = text.replaceAll(" is", " IS");
        System.out.println("Replaced text: " + replacedText);
        return replacedText.toString();
    }

    static File fileContentReplacer(String text, Map<String, String> map) {
        String replacedText = text.replaceAll(" is", " IS");
        System.out.println("Replaced text: " + replacedText);
        File file = new File("/Users/Mala/Desktop/newFile.txt");
        try (Writer writer = new FileWriter(file)) {
            writer.write(replacedText);
            System.out.println("File was written in a new file");
        } catch (IOException e) {
            System.err.println("Caught IOException! ");
        }
        return file;
    }

    static void fileContentMerger(String text) throws IOException {
        String replacedText = text.replaceAll(" is", " IS");
        System.out.println("Replaced text: " + replacedText);
        try {
           FileWriter fw= new FileWriter("/Users/Mala/Desktop/HW11.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(replacedText);
            System.out.println("Result was written to existing File content ");
            bw.close();
        } catch (IOException e) {
            System.err.println("Caught IOException! ");
        }
    }

}

