import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boyut;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("boyut : ");
        boyut = scan.nextInt();


        if (boyut > 0) {
            int arr[] = new int[boyut];
            for (int j = 0; j <= boyut; j++) {
                if (i < j) {
                    System.out.println(j + ". elemanı giriniz");
                    arr[i] = scan.nextInt();
                    i++;
                }
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}