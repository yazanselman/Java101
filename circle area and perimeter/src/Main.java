import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double area;
        double pi = 3.14;
        double perimeter;
        double a ;
        double areaofa;

        Scanner input = new Scanner(System.in);
        System.out.println("Daire yarıçapını giriniz : ");
        r = input.nextInt();

        System.out.println("Daire dilimi açısı giriniz : ");
        a = input.nextInt();
        area = pi *(r*r);
        perimeter = 2 * pi * r;

        System.out.println("Çevre : " + perimeter);
        System.out.println("Alan : " + area);
        areaofa = (pi * r *r *a ) / 360;
        System.out.println("Daire dilimi alanı : " + areaofa);
    }
}