import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        int n;
        int nFactoriel = 1;
        int rFactoriel = 1;
        int nrFactoriel = 1;
        double sonuc;

        Scanner scan = new Scanner(System.in);
        System.out.println("n :");
        n = scan.nextInt();
        System.out.println("r :");
        r = scan.nextInt();



        for (int i = 1; i <= n; i++) {
            nFactoriel *= i;
            }
        for (int i = 1; i <= r; i++) {
            rFactoriel *= i;
        }
        for (int i = 1; i <= n-r; i++) {
            nrFactoriel *= i;
        }
        sonuc = nFactoriel / (rFactoriel - nrFactoriel);
        System.out.println(sonuc);

        }
    }
}