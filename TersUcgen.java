import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ters Üçgenin Basamak Sayısını Giriniz : ");
            int n = scanner.nextInt();
            int i, j, k;

            for (i = (n - 1); i >= 0; i--) {
                for (j = 1; j <= (n - i); j++) {
                    System.out.print(" ");
                }
                for (k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
