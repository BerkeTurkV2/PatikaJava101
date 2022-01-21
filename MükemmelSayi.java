import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz : ");
            int Sayi = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i < Sayi; i++) {
                if (Sayi % i == 0) {
                    sum += i;
                }
            }
            if (Sayi == sum) {
                System.out.println(Sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(Sayi + " Mükemmel sayı değildir.");
            }
        }
    }
}
