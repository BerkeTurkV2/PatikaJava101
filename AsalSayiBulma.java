import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz : ");
            int Sayi = scanner.nextInt();

            for (int i = 2; i <= Sayi; i++) {
                int count = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count <= 1) {
                    System.out.println("1 den " + Sayi + "'e kadar asal sayılar : " + i);
                }
            }
        }
    }
}
