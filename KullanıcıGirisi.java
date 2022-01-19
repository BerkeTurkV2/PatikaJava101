import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            String UserName = scanner.nextLine();

            System.out.print("Şifrenizi Giriniz : ");
            String Password = scanner.nextLine();

            if(UserName.equals("BerkeTurk") && (Password.equals("12345"))){
                System.out.println("Giriş Başarılı...");
            }
            else if(UserName.equals("BerkeTurk") && !(Password.equals("12345"))) {
                System.out.println("Şifrenizi yanlış girdiniz, Şifrenizi Sıfırlamak ister misiniz? (y/n) ");
                String Sıfırla = scanner.nextLine();

                if(Sıfırla.equals("y")) {
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    String NewPassword = scanner.nextLine();

                    if(NewPassword.equals(Password) || (NewPassword.equals("12345"))){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else{
                        System.out.println("Yeni Şifre oluşturuldu.");
                    }
                }
                else if(Sıfırla.equals("n")){
                    System.out.println("Tekrar giriş yapmayı deneyiniz.");
                }
            }
            else if(!(UserName.equals("BerkeTurk")) && (Password.equals("12345"))) {
                System.out.println("Kullanıcı Adınızı yanlış girdiniz.");
            }
            else{
                System.out.println("Kullanıcı Adı ve Şifrenizi yanlış girdiniz. ");
            }
        }
    }
}
