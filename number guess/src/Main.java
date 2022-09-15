import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Random r = new Random();
        int a = r.nextInt(100);
        System.out.println(a);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("How many guesses do you want to use : ");
        int maxguesscount = scan2.nextInt();

        boolean stop = true;
        boolean correct = false;
        int count = 0;
        int newscore = 0;
        int score;

        while (stop) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Guess Number : ");
            int number = scan.nextInt();
            count++;
            if (number != a) {
                System.out.println("//////// You used " + count + " guess ///////");
                if (count == maxguesscount) {
                    System.out.println("You failed... You have reached the maximum guessing limit!!!");
                    stop = false;
                } else {
                    if (number < a) {
                        System.out.println("Please Guess bigger number");
                    } else {
                        System.out.println("Please Guess smaller number");
                    }
                }
            } else {
                System.out.println("You guessed the number correctly in " + count + " tries ");
                correct = true;
                stop = false;
            }

            score = Math.abs(number - a);
            newscore = newscore + score;
            if (correct == true) {
                if (count < 5) {
                    System.out.println("Congrulation You win 100 points for knowing before 5 guesses");
                    newscore = 100;
                } else if (count < 10) {
                    System.out.println("Congrulation You win 50 points for knowing before 10 guesses");
                    newscore = 50;
                } else {
                    System.out.println("You failed");
                    newscore = 50 - newscore;
                }
                System.out.println("Your score : " + newscore);

            }

        }
    }
}