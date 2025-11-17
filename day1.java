import java.util.Random;
import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        
        int x = random.nextInt(100);
        int guess = 0;
        
        while (guess != x) {
            System.out.println("Guess a num between 1-100");
            guess = Integer.parseInt(scanner.nextLine());
            if (guess == x){
                System.out.println("gj");
            } else {
                if (guess <= x){
                    System.out.println("guess higher");        
                } else{
                    System.out.println("guess lower");
                }
            }
        }
        
    }
}
