package ExceptionHandlingHome;

/*
Write a Java program that reads a file and throws an exception if the file is empty.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        try{
            checkIfFileIsEmpty("src/ExceptionHandlingHome/text.txt");
            System.out.println("File is not empty.");
        } catch (FileNotFoundException | EmptyFileException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkIfFileIsEmpty(String fileName) throws FileNotFoundException, EmptyFileException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        if(!sc.hasNextLine()){
            sc.close();
            throw new EmptyFileException ("File is empty");
        }
        sc.close();
    }
}

class EmptyFileException extends Exception{
    public EmptyFileException(String message){
        super(message);
    }
}
