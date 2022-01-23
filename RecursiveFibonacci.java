import java.util.Scanner;

public class RecursiveFibonacci {

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir n sayısı giriniz : ");
            int n = scanner.nextInt();

            System.out.println(n + " sayısının fibonacci serisi(toplamı) : " + fibonacci(n));
        }
    }
}
