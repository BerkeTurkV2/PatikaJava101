import java.util.Scanner;

public class RecursiveDesen {
    static int Pattern(int n, int temp, int x, int a) {
        if (n > 0 && x > 0) {
            System.out.println(n);
            n -= a;
        } else {
            System.out.println(n);
            x = -1;
            n += a;
            if (n == temp) {
                System.out.println(n);
                return 1;
            }
        }
        return Pattern(n, temp, x, a);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("N sayısı : ");
            int n = scanner.nextInt();
            System.out.print("Kaçar kaçar artıp azalsın ? : ");
            int a = scanner.nextInt();

            Pattern(n, n, n, a);
        }
    }
}
