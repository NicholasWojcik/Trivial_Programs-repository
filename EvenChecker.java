package evenchecker;

import java.util.Scanner;

public class EvenChecker {
    static String userNum = "";
    
    static Scanner TextInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(true){
            System.out.println("Enter a number to see if it is even.");
            userNum = TextInput.next();
            try{
                if(Double.parseDouble(userNum) % 2 == 0){
                    System.out.println("***" + userNum + " is EVEN.***\n");
                }
                else{
                    System.out.println("***" + userNum + " is ODD.***\n");
                }
            }
            catch(Exception e){
                System.out.println("***A NUMBER! ENTER A NUMBER!***\n");
            }
        }
    }
    
}
