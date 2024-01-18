// Task 2 : Write a Java program for Rock, Paper and Scissors game.

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        String moves[] = {"Rock", "Paper", "Scissors"};
        String computerMove = moves[new Random().nextInt(moves.length)];

        Scanner Mymove = new Scanner(System.in);
        String yourMove;

        while(true) {
            System.out.print("Enter your move (Rock, Paper or Scissors) => ");
            yourMove = Mymove.nextLine(); 
            if(yourMove.equals("Rock") || yourMove.equals("Paper") || yourMove.equals("Scissors")){
                break;
            }else{
                System.out.println("Your move is invalid.\nPlay with a valid move!");
            }
        }
        System.out.println("Computer played => " + computerMove);

        if(computerMove.equals(yourMove)){
            System.out.println("The game is tied!");
        }
        else if(yourMove.equals("Rock")){
            if(computerMove.equals("Paper")){
                System.out.println("Sorry! You lose!");
            }else if(computerMove.equals("Scissors")){
                System.out.println("Fabulous! You won!");
            }
        }
        else if(yourMove.equals("Paper")){
            if(computerMove.equals("Scissors")){
                System.out.println("Sorry! You lose!");
            }else if(computerMove.equals("Rock")){
                System.out.println("Fabulous! You won!");
            }
        }
        else if(yourMove.equals("Scissors")){
            if(computerMove.equals("Rock")){
                System.out.println("Sorry! You lose!");
            }else if(computerMove.equals("Paper")){
                System.out.println("Fabulous! You won!");
            }
        }
        
    }
}
