import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Kaç tane sayı gireceksiniz? : ");
            int Sayi = scanner.nextInt();

            int max = 0, min = 0;

            for (int i = 1; i <= Sayi; i++) {
                System.out.print(i + "- Sayıyı giriniz : ");
                int n = scanner.nextInt();

                if (i == 1) {
                    max = n;
                    min = n;
                } else {
                    if (n > max) {
                        max = n;
                    } else if (n < min) {
                        min = n;
                    }
                }
            }
            System.out.println("En büyük sayı : " + max);
            System.out.println("En küçük sayı : " + min);
        }
    }
}
