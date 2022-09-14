import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int number;
        int sayac;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        number = scan.nextInt();


        while(number > 2) {

            sayac = 0;
            for(int i = 2; i < number; i++)
            {
                if(number % i == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println(number + " asal bir sayidir.");
            }
            number--;
        }
    }
}