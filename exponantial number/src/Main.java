import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        int n;
        int sonuc = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz :");
        n = scan.nextInt();
        System.out.println("üs giriniz :");
        r = scan.nextInt();

        for (int i = 1; i < r; i++) {
            sonuc *= n;
        }

        System.out.println(sonuc);
    }
}