import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("n1 sayısını giriniz : ");
            int n1 = scanner.nextInt();

            System.out.print("n2 sayısını giriniz : ");
            int n2 = scanner.nextInt();

            int i = 1;
            int ebob = 1, ekok = 1;
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println(n1 + " ve " + n2 + " sayılarının ebobu : " + ebob);

            ekok = (n1 * n2) / ebob;

            System.out.println(n1 + " ve " + n2 + " sayılarının ekoku : " + ekok);

        }
    }
}
