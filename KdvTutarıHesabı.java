import java.util.Scanner;

public class KdvTutarıHesabı {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Para Tutarını Giriniz: ");
            int Para = scanner.nextInt();

            double Kdv = 0.18;
            double Kdv2 = 0.08;
            
            boolean Miktar = Para > 0 && Para <= 1000 ;

            double KdvTutar = Para *Kdv;
            double Kdv2Tutar = Para *Kdv2;

            double KdvDurum = Miktar ? KdvTutar : Kdv2Tutar ;

            double KdvFiyat = KdvDurum + Para;

            System.out.println("Kdv'siz Fiyat = " + Para);
            System.out.println("Kdv'li Fiyat = " + KdvFiyat);
            System.out.println("Kdv Tutarı = " + KdvDurum);
        }

    }
}
