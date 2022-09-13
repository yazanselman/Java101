import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int count = 0;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");

        a = scan.nextInt();

        for(int b = 1 ; b<a ; b++){
            if(b%12 == 0){
                count++;
                toplam += b;
            }
          
        }
        System.out.println(toplam/count);
    }
}