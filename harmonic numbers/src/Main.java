import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double result = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz :");
        n = scan.nextInt();

        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }

        System.out.println(result);

    }
}