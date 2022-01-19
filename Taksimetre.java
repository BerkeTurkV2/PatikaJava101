import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Taksi ile gidilen mesafeyi (km cinsinden) yazınız : ");

            int Km = scanner.nextInt();
            double KmTutarı = 2.20;
            int TaksiAcilis= 10;

            double Ucret = TaksiAcilis + (Km*KmTutarı);
            
            boolean Tutar = Ucret >= 20 ;

            double Toplam = Tutar ? Ucret : 20 ;

            System.out.println("Gidilen mesafe " + Km + " Km'dir.");
            System.out.println("*** Km başına tutar " + KmTutarı + " TL'dir. *** ");
            System.out.println("*** Taksi açılış ücreti " + TaksiAcilis + " TL'dir. *** ");
            System.out.println("*** Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır. *** ");
            System.out.println("Ödenecek Tutar : " + Toplam + " TL'dir.");

        }
    }
}
