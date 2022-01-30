package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Dizinin boyutunu giriniz : ");
            int n = scanner.nextInt();

            int arr[] = new int[n];
            int startİndex = 0;
            System.out.println("Dizinin elemanlarını giriniz : ");

            for ( int i = 1; i <= n; i++){
                System.out.print(i + ". Elemanı : ");
                int x = scanner.nextInt();
                arr[startİndex++] = x;
                System.out.println();
            }
            Arrays.sort(arr);
            System.out.println("Küçükten büyüğe sıralaması : " + Arrays.toString(arr));
        }
    }
}
