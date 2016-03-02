package primechecker;

import java.util.Scanner;

public class PrimeChecker {
    static int userNum = 0;
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int prime = 1;
        
        System.out.println("Enter a number to be checked for primeness.");
        try{
            userNum = Integer.parseInt(input.next());
            for(int i = 2; i < (userNum); i++){
                if((userNum % i) == 0){
                    System.out.println("*** " + userNum + " is NOT PRIME. ***");
                    prime = 0;
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.println("Should've entered a number...");
        }
        if(prime == 1){
            System.out.println("*** " + userNum + " is PRIME. ***");
        }
    }
}
