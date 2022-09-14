import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,n,l,m;

        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        n = scan.nextInt();


        for (k = 1; k <= n; k++) {
            for (l = 1; l <= k; l++)//döngümüz ile baklava diliminin alt kısımının sol tarafındaki boşlukları belirtiyoruz.
            {
                System.out.print(" ");
            }
            for (m = n; m > k; m--)//bu döngümüz ile baklava diliminin alt kısımındaki yıldızları ve arasındaki boşlukları belirtiyoruz.
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}