import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik;
        int toplam = 0;
        int counter= 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Matematik notu : ");
            matematik = input.nextInt();
            if(matematik>0 && matematik<100){
                toplam += matematik;
                counter++;
            }

            System.out.println("Fizik notu : ");
            fizik = input.nextInt();
            if(fizik>0 && fizik<100){
                toplam += fizik;
                counter++;
            }
            System.out.println("Kimya notu : ");
            kimya = input.nextInt();
            if(kimya>0 && kimya<100){
                toplam += kimya;
                counter++;
            }
            System.out.println("Müzik notu : ");
            muzik = input.nextInt();
            if(muzik>0 && muzik<100){
                toplam += muzik;
                counter++;
            }
            System.out.println("Türkçe notu : ");
            turkce = input.nextInt();
            if(turkce>0 && turkce<100){
                toplam += turkce;
                counter++;
            }
        }

        double sonuc = toplam / counter;

        System.out.println("Ortalama notunuz : " + sonuc);
        System.out.println(sonuc < 55 ? "Sınıfta Kaldı" : "Sınıfı geçti");

    }
}