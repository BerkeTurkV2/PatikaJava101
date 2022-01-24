import java.util.Scanner;

public class RecursiveUsluSayi {
    static int exponential(int x, int y) {

        int Toplam = 1;
        for (int i = 1; i <= y; i++) {
            Toplam *= x;
        }
        return Toplam;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Taban değerini giriniz : ");
            int x = scanner.nextInt();

            System.out.print("Üs değerini giriniz : ");
            int y = scanner.nextInt();

            System.out.println(exponential(x, y));
        }
    }
}
