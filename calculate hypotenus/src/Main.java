import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        double c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dik kenar uzunluğu giriniz : ");
        a=scan.nextInt();
        System.out.println("Dik kenar uzunluğu giriniz : ");
        b=scan.nextInt();

        c = Math.sqrt((a*a) + (b*b)) ;
        System.out.println("hipotenüs uzunluğu : " + c);


    }
}