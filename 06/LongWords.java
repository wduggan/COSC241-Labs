// package week06;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

/**
 * Lab 06 - 31/03/2020.
 * @author William Duggan
 */
public class LongWords {

    /** maximum LIMIT for ArrayList to have. */
    static final int LIMIT = 10;
    /** ArrayList to store String objects. */
    private static ArrayList<String> words = new ArrayList<String>();
    
    /**
     * Main method which reads a System.in file and acts upon it.
     * @param args - command line arguments are not used.
     */
    public static void main(String[] args) {
        DecimalFormat numFormat = new DecimalFormat("#.00");
        double sum = 0;
        double wordCount = 0;
        double averageLength = 0;
        
        Scanner fileScan = new Scanner(System.in);
        while (fileScan.hasNext() && words.size() < LIMIT){
            words.add(fileScan.next());
        }

        // Compute average
        for (String word : words){
            //System.out.println(word);
            sum += word.length();
            wordCount += 1;
        }
        averageLength += sum / wordCount;
        for (int i = words.size(); i > 0; i--){
            if (words.get(i-1).length() > averageLength) {
                System.out.println(words.get(i-1));
            }
        }
        if (words.size() != 0) {
            //System.out.println("Size of ArrayList is: " + words.size());
            //System.out.println("The sum of all word lengths is: " + sum);
            //System.out.println("The wordCount is: " + wordCount);
            System.out.println("Average: " + numFormat.format(averageLength));
        }
    }
}
