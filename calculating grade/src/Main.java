import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik;
        int fizik;
        int kimya;
        int muzik;
        int turkce;
        int tarih;

        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Matematik notu : ");        
            matematik = input.nextInt();
            
            System.out.println("Fizik notu : ");        
            fizik = input.nextInt();
            
            System.out.println("Kimya notu : ");        
            kimya = input.nextInt();
            
            System.out.println("Müzik notu : ");        
            muzik = input.nextInt();
            
            System.out.println("Türkçe notu : ");        
            turkce = input.nextInt();
            
            System.out.println("Tarih notu : ");        
            tarih = input.nextInt();
        }
        
        int toplam = matematik + fizik + kimya + muzik + turkce + tarih;

        double sonuc = toplam / 6;

        System.out.println("Ortalama notunuz : " + sonuc);

    }
}