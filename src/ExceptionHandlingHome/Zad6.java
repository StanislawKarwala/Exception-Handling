package ExceptionHandlingHome;

/*
Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int numOfInputs = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Input integers:");
        boolean hasDuplicates = false;

        for(int i = 0; i < numOfInputs; i++){
            int number = sc.nextInt();
            try{
                if(list.contains(number)){
                    hasDuplicates = true;
                    throw new DuplicateNumberException("Error: duplicate number found: " + number);
                }
                list.add(number);
            } catch (DuplicateNumberException e){
                System.out.println(e.getMessage());
                break;
            }
        }
        if(!hasDuplicates){
            System.out.println("No duplicate numbers!");
        }
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}