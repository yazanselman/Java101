import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int a;
        int b;
        int process;
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        a = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        b = scan.nextInt();

        System.out.println("İşlem Seçiniz : ");
        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        process = scan.nextInt();

        switch (process) {
            case 1:
                System.out.println(a + b);
            case 2:
                System.out.println(a - b);
            case 3:
                System.out.println(a * b);
            case 4:
                System.out.println(a / b);
            default:
                break;
        }

    }
}