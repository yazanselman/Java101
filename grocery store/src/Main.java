import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut;
        double elma;
        double muz;
        double domates;
        double patlican;
        double kayisi;


        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Armut kilo : ");
            armut = input.nextInt();

            System.out.println("Elma kilo : ");
            elma = input.nextInt();

            System.out.println("Muz kilo : ");
            muz = input.nextInt();

            System.out.println("Domates kilo : ");
            domates = input.nextInt();

            System.out.println("Patlıcan kilo : ");
            patlican = input.nextInt();

            System.out.println("Kayısı kilo : ");
            kayisi = input.nextInt();
        }

        double toplam = (armut*2.14) + (elma*3.67) + (muz*1.11) + (domates*0.95) + (patlican*1.12) + (kayisi*0.95);
        System.out.println("Toplam Tutar : " + toplam);
    }
}