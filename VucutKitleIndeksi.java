import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Lütfen Boyunuzu Giriniz ( Metre cinsinden Orn; 1,72 ) : ");
            double Boy = scanner.nextDouble();

            System.out.print("Lütfen Kilonuzu Giriniz : ");
            double Kilo = scanner.nextDouble();

            double VKI = Kilo / (Boy*Boy);

            System.out.println("Vücut Kitle Indeksiniz : " + VKI);
        }
    }
    
}
