package ExceptionHandlingHome;

/*
Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
*/

public class Zad2 {
    public static void main(String[] args) {
        isOdd(18);
        isOdd(7);
    }

    public static void isOdd(int number){
        try{
            if(number % 2 != 0){
                throw new IllegalArgumentException(number + " is odd");
            }
            System.out.println(number + " is even");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
