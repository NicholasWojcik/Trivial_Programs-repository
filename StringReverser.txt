package stringreverser;

import java.util.Scanner;

public class StringReverser {
    static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args) {
        String original, reversed = "";
        
        System.out.println("Enter a word to be reversed.");
        original = input.next();
        
        int length = original.length();
        
        for (int i = length - 1; i >= 0; i--){
            reversed = reversed + original.charAt(i);
        }
        System.out.println(reversed);
    }  
}
