import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);

        do {
            a = scan.nextInt();
            if (a % 4 == 0) {
                toplam += a;
            }
        } while (a % 2 == 0);
        System.out.println(toplam);
    }
}
