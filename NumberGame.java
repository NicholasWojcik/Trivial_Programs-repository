package numbergame;

import java.util.Scanner;

public class NumberGame {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String userChoice;
        int choosenNum = 0;
        int playerChoice = 0;
        
        System.out.println("Welcome to The Number Game.\n");
        
        while(true){
            System.out.println("__________________________________\n"
                    + "1 - PLAY or 2 - INSTRUCTIONS");
            userChoice = input.next();
            System.out.println("__________________________________");                
            if(userChoice.equals("2")){
                System.out.println("OBJECTIVE: Be the player that breaks past 0.\n");
                System.out.println("Rotating back and forth, each player will choose the\n"
                        + "number '1' or the number '2'.  The number choosen will be\n"
                        + "deducted from a choosen number.  Be the player that\n"
                        + "brings this number past 0.");
            }
            else if(userChoice.equals("1")){
                break;
            }
            else{
                System.out.println("Invalid.  Choose 1 or 2, there are no other "
                        + "options.");
            }
        }
        while(true){
            int x = 0;
            try{
                System.out.println("What number would you like to begin with?");
                choosenNum = Integer.parseInt(input.next());
                while(x == 0){
                    System.out.println("__________________________________");
                    System.out.println("1 - Human vs. AI    or   2 - Human vs. Human");
                    playerChoice = Integer.parseInt(input.next());
                    System.out.println("__________________________________");
                    if(playerChoice == 1 || playerChoice == 2){
                        x = 1;
                    }
                    else{
                        System.out.println("Invalid. Please enter '1' or '2'.");
                        System.out.println("__________________________________");
                    }     
                }
                break;
            }
            catch(Exception e){
                System.out.println("__________________________________");
                System.out.println("Invalid.  Please enter only numbers.");
                System.out.println("__________________________________");
            }
        }
        //HUMAN VS AI ENGINE
        if(playerChoice == 1){
            System.out.println("__________________________________\n");
            while(choosenNum >= 0){
                int userNum = 0;

                System.out.println("Remaining: " + choosenNum + ".\n");
                
                while(true){
                    System.out.print("** Player1: ");
                    userNum = Integer.parseInt(input.next());
                    
                    if(userNum != 1 && userNum != 2){
                        System.out.println("Only 1 or 2 are allowed.\n");
                    }
                    else{
                        break;
                    }
                }
                choosenNum = choosenNum - userNum;
                
                if(choosenNum < 0){
                    System.out.println("\n*******PLAYER1 WINS!*******");
                }
                else{
                    int choiceAI = 0;
                    System.out.print("\nRemaining: " + choosenNum + ".\n\n");
                    
                    if(choosenNum == 4){
                        choiceAI = 2;
                    }
                    else if(choosenNum == 3){
                        choiceAI = 1;
                    }
                    else if(choosenNum % 2 == 0){
                        choiceAI = 1;
                    }
                    else if(choosenNum % 2 == 1){
                        choiceAI = 2;
                    }
                    
                    System.out.print("** AI: " + choiceAI + ".\n\n");
                    choosenNum = choosenNum - choiceAI;
                    
                    if(choosenNum < 0){
                        System.out.println("\n*******AI WINS!*******");
                    }
                }
            }
        }
        //HUMAN VS HUMAN ENGINE
        else{
            while(choosenNum >= 0){
                int userNum = 0;
                
                System.out.println("__________________________________");
                System.out.println("Remaining: " + choosenNum + ".\n");
                
                while(true){
                    System.out.print("Player1:");
                    userNum = Integer.parseInt(input.next());
                    
                    if(userNum != 1 && userNum != 2){
                        System.out.println("Only 1 or 2 are allowed.\n");
                    }
                    else{
                        break;
                    }
                }
                choosenNum = choosenNum - userNum;
                
                if(choosenNum < 0){
                    System.out.println("\n*******PLAYER1 WINS!*******");
                }
                else{
                    System.out.print("__________________________________\n");
                    System.out.print("Remaining: " + choosenNum + ".\n\n");
                    
                    while(true){
                        System.out.print("Player2:");
                        userNum = Integer.parseInt(input.next());
                        
                        if(userNum != 1 || userNum != 2){
                            System.out.println("Only 1 or 2 are allowed.\n");
                        }
                        else{
                            break;
                        }
                    }
                    
                    choosenNum = choosenNum - userNum;
                    
                    if(choosenNum < 0){
                        System.out.println("\n*******PLAYER2 WINS!*******");
                    }
                }
            }
        }
        System.out.println("\n\n********* THANKS FOR PLAYING *********");
    }    
}
