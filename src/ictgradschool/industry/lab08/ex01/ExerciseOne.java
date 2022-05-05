package ictgradschool.industry.lab08.ex01;

import java.io.*;
import java.util.Locale;

public class ExerciseOne {

    public void start() {

        printNumEsWithFileReader();

        printNumEsWithBufferedReader();

    }

    private void printNumEsWithFileReader() {

        int numE = 0;
        int total = 0;
        String data = "";
        int count=0;
        // TODO Read input2.txt and print the total number of characters, and the number of e and E characters.
        // TODO Use a FileReader.
        try {
            FileReader fR = new FileReader("input2.txt");
            while ((total = fR.read()) != -1) {
                for (int i=0; i < data.length(); i++) {
                    if (data.charAt(i) != ' ') {
                    count++;
                    }
                }
                if ( data.contains("e")) {
                    numE = numE + 1;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of e/E's: " + numE + " out of " + count);
    }

    private void printNumEsWithBufferedReader() {

        int numE = 0;
        int total = 0;

        // TODO Read input2.txt and print the total number of characters, and the number of e and E characters.
        // TODO Use a BufferedReader.
        File myFile = new File("input2.txt");
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            while ((line = reader.readLine()) != null) {
                for (int i=0; i < line.length(); i++ ) {
                    if (line.charAt(i) != ' ') {
                        total++;
                    }
                }
            }
            while ((line = reader.readLine()) != null){
                for (int i=0; i < line.length(); i++) {
                    line.toLowerCase(Locale.ROOT);
                    if (line.contains("e")); {
                        numE++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("Number of e/E's: " + numE + " out of " + total);
    }

    public static void main(String[] args) {
        new ExerciseOne().start();
    }

}
