package ExceptionHandlingHome;

/*
Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
*/

public class Zad7 {
    public static void main(String[] args) {
        String word = "arkadata";
        boolean hasVowel = false;
        try{
            for(int i = 0; i < word.length(); i++){
                char chWord = word.toUpperCase().charAt(i);
                if(chWord == 'A' || chWord == 'E' || chWord == 'I' || chWord == 'O' || chWord == 'U' || chWord == 'Y'){
                    hasVowel = true;
                    System.out.println("Vowel found in the word");
                    break;
                }
            }
            if(!hasVowel){
                throw new NotVowelException("Error: No vowels found in the word");
            }
        } catch (NotVowelException e){
            System.out.println(e.getMessage());
        }
    }
}

class NotVowelException extends Exception {
    public NotVowelException(String message) {
        super(message);
    }
}
