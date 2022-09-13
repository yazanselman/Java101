import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int weather;

        Scanner scan = new Scanner(System.in);
        weather = scan.nextInt();

        if(weather<5){
            System.out.println("Kayak");
        }else if(weather<15){
            System.out.println("Sinema");
        }else if(weather<25){
            System.out.println("piknik");
        }else{
            System.out.println("Yüzme");
        }

    }
}