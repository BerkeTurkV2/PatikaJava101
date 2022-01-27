package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SayiyaGöreMinMax {
    public static void main(String[] args) {
        int arr[] = { 15, 12, 788, 1, -1, -778, 2, 0 };
        System.out.println("Dizi : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sıralanmış : " + Arrays.toString(arr));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Sayı Giriniz : ");
            int n = scanner.nextInt();
            int x = 0, y = 0;

            for (int i : arr) {
                if (i < n) {
                    x = i;
                } else {
                    y = i;
                    break;
                }
            }
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + x);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + y);
        }
    }
}
