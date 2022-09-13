import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       

        int n1;
        int n2;
        int max;
        int ebob = 0;
        int ekok = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        n1 = scan.nextInt();
        System.out.println("Bir sayı giriniz : ");
        n2 = scan.nextInt();


        for(int i = 1; i < n1; i++)
        {
            if(n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = " + ebob);

        max = n1*n2;
        for(int i = max; i > 0; i--)
        {
            if(i % n1 == 0 && i % n2 == 0) {
                ekok = i;
            }
        }
        System.out.println("Ekok = " + ekok);
        

    }
}