package vowelcounter;

import java.util.Scanner;

public class VowelCounter {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput = "";
        int vowelCount = 0;
        int stringCount = 0;
        
        System.out.print("Please enter a word to be vowel counted.\n\t");
        userInput = keyboard.nextLine().toLowerCase();
        
        for(int i = 0; i < (userInput.length()); i++){
            switch(userInput.charAt(i)){
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'a':
                    vowelCount++;
            }
        }
        System.out.println("There are " + Integer.toString(vowelCount) + 
                " vowels.");
    }
    
}
