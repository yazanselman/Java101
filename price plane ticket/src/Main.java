import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double mesafe;
        int yas, yolculukTipi;
        double sonuc,sonuc1,sonuc2,sonuc3,sonuc4,sonuc5,sonuc6;
        double indirim1,indirim2,indirim3,indirim4,indirim5,indirim6;
        double gd1,gd2,gd3;
        double gdt1,gdt2,gdt3;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen gideceğiniz mesafeyi km cinsinden giriniz:");
        mesafe=input.nextDouble();
        System.out.println("Lütfen yaşınızı giriniz:");
        yas=input.nextInt();
        System.out.println("Lütfen yolculuk tipini belirtiniz:\nTek yön ise 1, gidiş dönüş ise 2 giriniz.");
        yolculukTipi=input.nextInt();

        sonuc=mesafe*0.1;

        if(yolculukTipi==1){
            if(yas<12){

                indirim1=sonuc*0.50;
                sonuc1=sonuc-indirim1;
                System.out.println("Ödeyeceğiniz tutar: "+sonuc1);

            }

            else if(yas>=12 && yas<=24){

                indirim2=sonuc*0.10;
                sonuc2=sonuc-indirim2;
                System.out.println("Ödeyeceğiniz tutar: "+sonuc2);

            }

            else if(yas>65){

                indirim3=sonuc*0.30;
                sonuc3=sonuc-indirim3;
                System.out.println("Ödeyeceğiniz tutar: "+sonuc3);

            }

            else{
                System.out.println("Ödeyeceğiniz tutar: "+sonuc);
            }



        } else if (yolculukTipi==2){
            if (yas<12){

                indirim4=(sonuc*0.50);
                sonuc4=sonuc-indirim4;
                gd1=sonuc4*0.20;
                gdt1=(sonuc4-gd1)*2;
                System.out.println("Ödeyeceğiniz tutar: "+gdt1);

            } else if(yas>=12 && yas<=24){

                indirim5=(sonuc*0.10);
                sonuc5=sonuc-indirim5;
                gd2=sonuc5*0.20;
                gdt2=(sonuc5-gd2)*2;
                System.out.println("Ödeyeceğiniz tutar: "+gdt2);

            }else if(yas>65){

                indirim6=(sonuc*0.30);
                sonuc6=sonuc-indirim6;
                gd3=sonuc6*0.20;
                gdt3=(sonuc6-gd3)*2;
                System.out.println("Ödeyeceğiniz tutar: "+gdt3);
            }

        } else {

            System.out.println("Hatalı bir işlem yaptınız!");
        }



    }

}