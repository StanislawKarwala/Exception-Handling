package ExceptionHandlingHome;

/*
Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        try{
            readsFile("src/ExceptionHandlingHome/text.txt");
            System.out.println("All numbers are non-positive");
        } catch(FileNotFoundException | IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readsFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        System.out.println("Content of " + fileName + ":");
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
            try{
                int number = Integer.parseInt(line.trim());
                if(number > 0){
                    throw new IllegalArgumentException("Positive number found: " + number);
                }
            } catch (NumberFormatException e){}
        }
        sc.close();
    }
}
