//TODO: Find a way to include the minimum value in output

package randomgenerator;

import java.util.Scanner;

public class RandomGenerator {
    static String ranQuanity = "";
    static String ranMIN = "";
    static String ranMAX = "";
    
    static Scanner TextIn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers do you need generated?");
        ranQuanity = TextIn.next();
        System.out.println("MIN number?");
        ranMIN = TextIn.next();
        System.out.println("MAX number?");
        ranMAX = TextIn.next();
        System.out.println("");
        
        int ranQuanInt = Integer.parseInt(ranQuanity) + 1;
        int ranIntMax = Integer.parseInt(ranMAX) - Integer.parseInt(ranMIN);
        
        for(int i = 1; i < ranQuanInt; i++){
            System.out.println((int)(Math.random()* ranIntMax +1)+ Integer.parseInt(ranMIN));
        }
    }
    
}
