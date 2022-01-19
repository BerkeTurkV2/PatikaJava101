import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("1. Sayıyı Giriniz : ");
            double Sayı1 = scanner.nextDouble();

            System.out.print("2. Sayıyı Giriniz : ");
            int Sayı2 = scanner.nextInt();

            System.out.println("Yapmak istediğiniz İşlemi Seçiniz...");
            System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");

            int Secim = scanner.nextInt();
            double Bölme = (Sayı1/Sayı2);

            switch(Secim){
                case 1:
                System.out.println("Toplama İşleminin Sonucu : " + (Sayı1+Sayı2));
                break;

                case 2:
                System.out.println("Çıkarma İşleminin Sonucu : " + (Sayı1-Sayı2));
                break;

                case 3:
                System.out.println("Çarpma İşleminin Sonucu : " + (Sayı1*Sayı2));
                break;

                case 4:
                    switch(Sayı2){
                        case 0:
                        System.out.println("0 Sayısı Bölme İşleminde Belirsizlik Oluşturur.");
                        break;

                        default:
                        System.out.println("Bölme İşleminin Sonucu : " + Bölme);
                        break;
                    }
                break;       
                
                default:
                System.out.println("Yanlış Bir Seçim Yaptınız. Tekrar Deneyiniz..");
                break;

            }
            
        }

    }
}
