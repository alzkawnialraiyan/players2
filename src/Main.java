import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {

            System.out.print("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
            String myMove = read.next();

            if (myMove.equals("quit")) {
                break;
            }

            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
                System.out.println("Your move isn't valid!");
            } else {
                System.out.print("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
                String P2moves = read.next();

                if (P2moves.equals("quit")) {
                    break;
                }
                if (P2moves.equals("rock")) {
                    P2moves = "rock" ;
                } else if (P2moves.equals("paper")) {
                    P2moves = "paper";
                } else if (P2moves.equals("scissors")) {
                    P2moves = "scissors";
                }else{
                    System.out.println("Your move isn't valid!");
                }
                System.out.println("Player2 move: " + P2moves);

                if (myMove.equals(P2moves)) {
                    System.out.println("It's a tie!");
                } else if ((myMove.equals("rock") && P2moves.equals("scissors")) || (myMove.equals("scissors") && P2moves.equals("paper")) || (myMove.equals("paper") && P2moves.equals("rock"))) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }

            }
        }
    }
} 