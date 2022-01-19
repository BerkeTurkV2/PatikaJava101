import java.util.Scanner;

public class ManavKasa {
   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Armut Kaç kilo ? : ");
           int Armut = scanner.nextInt();

           System.out.print("Elma Kaç kilo ? : ");
           int Elma = scanner.nextInt();

           System.out.print("Domates Kaç kilo ? : ");
           int Domates = scanner.nextInt();

           System.out.print("Muz Kaç kilo ? : ");
           int Muz = scanner.nextInt();

           System.out.print("Patlıcan Kaç kilo ? : ");
           int Patlıcan = scanner.nextInt();

           double ArmutFiyat = 2.14;
           double ElmaFiyat = 3.67;
           double DomatesFiyat = 1.11;
           double MuzFiyat = 0.95;
           double PatlıcanFiyat = 5.00;

           double Tutar = Armut*ArmutFiyat + Elma*ElmaFiyat + Domates*DomatesFiyat + Muz*MuzFiyat + Patlıcan*PatlıcanFiyat;

           System.out.print("Toplam Tutar : " + Tutar + " TL'dir." );
          
    }
   } 
}
