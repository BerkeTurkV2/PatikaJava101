import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz : ");
            int n = scanner.nextInt();

            int x = 0, y = 1, z;

            for (int i = 2; i <= n; i++) {
                z = x + y;
                System.out.println(z);
                x = y;
                y = z;
            }
        }
    }
}
