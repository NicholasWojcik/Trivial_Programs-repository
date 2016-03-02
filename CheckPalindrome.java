package checkpalindrome;

import java.util.Scanner;

public class CheckPalindrome {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String original, checker = "";
        
        System.out.println("Enter a word or number to check for palindromness:");
        original = input.next();
        for(int i = original.length() - 1; i >= 0; i--){
            checker = checker + original.charAt(i);
        }
        if(original.equals(checker)){
            System.out.println(original + " is a PALINDROME.");
        }
        else{
            System.out.println(original + " is NOT A PALINDROME.");
        }
    }
    
}
