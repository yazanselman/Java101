import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km;
        double ucret;
        double total;
        double start = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Km giriniz : ");
        km = input.nextInt();

        ucret = start + (km*2.2);
        total = ucret>20?ucret:20;

        System.out.println(total);
    }
}