import java.util.Random;
import java.util.Scanner;

public class Guess {
    private static final Random r = new Random();
    private static final int NUMBER = r.nextInt(100) + 1;
    private static int guess = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(guess != NUMBER){
            System.out.println(("Guess a number between 1 and 100"));
            guess = sc.nextInt();
            if(guess > NUMBER){
                System.out.println("Too large, guess again");
            }
            if(guess < NUMBER){
                System.out.println("Too small, guess again");
            } else if(guess == NUMBER){
                System.out.println("Bingo! you got it !!");
                System.exit(0);
            }
        }
        sc.close();
    }
}
