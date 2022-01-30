package Arrays;

import java.util.Arrays;

public class FrekansBulma {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Tekrar Sayıları ");
        Arrays.sort(arr);
        int count = 1, x = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != x) {

                for (int j = 0; j < arr.length; j++) {

                    if ((i != j) && (arr[i] == arr[j])) {
                        count++;
                        x = arr[i];
                    }
                }
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
                count = 1;

            }
        }
    }
}
