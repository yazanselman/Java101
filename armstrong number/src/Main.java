import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        int basamak = 0;
        int t,m;
        int k;
        int result = 0;
        int sonuc = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz :");
        r = scan.nextInt();
        k = r;
        m = r;


        while (k != 0) {
            k /= 10;
            basamak++;

        }

        while (m != 0) {
            t = m % 10;
            m /= 10;
            //  System.out.println(t);
            sonuc = 1;
            for (int i = 1; i <= basamak; i++) {
                sonuc *= t;
            }
            result += sonuc;

        }

        if (result == r) {
            System.out.println(r + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(r + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}
