import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double vat;
        int price;
        double vatprice;

        Scanner input = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz : ");
        price = input.nextInt();
        vat = price<1000 ? 0.18:0.08;
        vatprice = price + (price*vat);
        System.out.println("KDV oranınız : " + vat);
        System.out.println("Fiyat : " + price);
        System.out.println("KDV dahil fiyatı " + vatprice);



    }
}