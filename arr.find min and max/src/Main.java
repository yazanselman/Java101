import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);

        int r;
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();

        for (int i : list) {
            if (i > r) {
                int index = Arrays.binarySearch(list, i);
                System.out.println(index);
                System.out.println("Girilen sayıdan küçük en yakın sayı : " +list[index-1] );
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + i);
                break;
            }
        }
    }
}