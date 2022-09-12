import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password, newPassword;
        int choice;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz : ");
        username = scan.nextLine();

        System.out.println("Şifre agiriniz : ");
        password = scan.nextLine();

        if (!password.equals("deneme")) {
            System.out.println("Şifrenizi sıfırlamak ister misiniz");
            System.out.println("1 - Evet\n2 - Hayir");
            choice = scan.nextInt();
            if (choice == 1) {
                Scanner inp = new Scanner(System.in);
                System.out.println("yeni şifreyi giriniz");
                newPassword = inp.nextLine();
                System.out.println("d"+newPassword);
                if (newPassword.equals("deneme")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}