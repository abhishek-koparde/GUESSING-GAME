package OOPS;
import java.util.Random;
import java.util.Scanner;


/* RULES : IF THE ANSWER MATCHES THEN IT WILL BE EXCLUDED
           IF YOU HAVE TO WIN YOU HAVE TO GUESS THE CORRECT NUMBER WITHIN ATTEMPTS
           */

class GuessGame{
    private static byte guess  ;
    public static void check() {
        Scanner sc = new Scanner(System.in);
        byte userInput= 0;

        Random rand = new Random();
        byte randNum = (byte) rand.nextInt(100);
        while (randNum != userInput) {
            userInput = sc.nextByte();


            if (userInput > randNum) {
                System.out.println("lesser");
                guess++;

            } else if (userInput< randNum) {
                System.out.println("more");
                guess++;
            } else {
                System.out.println("congrats you have guessed it right in " + (guess+1) + "th attempt");
            }

        }
        if(guess>6){
            System.out.printf("\"YOU LOOSE\" THE TOTAL NUMBER OF GUESSES ARE -> %d",guess);
        }
        else{
            System.out.printf(" \"YOU WON\" THE TOTAL NUMBER OF GUESSES ARE -> %d",guess);
        }
    }
}
public class Game {
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        GuessGame gg = new GuessGame();
        gg.check();
    }
}
