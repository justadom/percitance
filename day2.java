import java.util.Random;
import java.util.Scanner;

class RockPaperScissorsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();     

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("this is rock paper scissors pick one");
        String pick = scanner.nextLine();



        int computer = random.nextInt(3);
        String selected = choices[computer];
        System.out.println("Computer picked: " + selected);

        if (pick.equals("rock") || pick.equals("paper") || pick.equals("scissors")) {
            if (selected.equals("rock") ) {
                if (pick.equals("rock")) {
                    System.out.println("tie");
                } else if (pick.equals("paper")) {
                    System.out.println("you win");
                } else{
                    System.out.println("you lose");
                }
        }
        if (selected.equals("paper") ) {
                if (pick.equals("rock")) {
                    System.out.println("you lose");
                } else if (pick.equals("paper")) {
                    System.out.println("tie");
                } else{
                    System.out.println("you win");
                }
        }
        if (selected.equals("scissors") ) {
                if (pick.equals("rock")) {
                    System.out.println("you win");
                } else if (pick.equals("paper")) {
                    System.out.println("you lose");
                } else{
                    System.out.println("tie");
                }
        }
        } else {
            System.out.println("guess right");
        }

        
        }
        
}
