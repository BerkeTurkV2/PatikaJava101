package Arrays;

import java.util.Arrays;

public class TekrarEdenSayilar {

    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 32, 5, 6, 3, 17, 22, 4, 65, 31, 43, 22, 4, 23, 6, 8 };
        Arrays.sort(arr);
        int duplicate[] = new int[arr.length];
        int indexStart = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] % 2 == 0) && (arr[i] == arr[j])) {
                    if (isFind(duplicate, arr[i])) {
                        duplicate[indexStart++] = arr[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
