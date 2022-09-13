import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        for (int i = 1; i < a; i*=4) {
            System.out.println(i);
            }
        for (int i = 1; i < a; i*=5) {
            System.out.println(i);
        }
        }
    }
}