package Arrays;

public class HarmonikOrt {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        double harmonicSum = 0;
        for (double i : arr) {
            harmonicSum += (1 / i);
        }
        double harmonicMean = arr.length / harmonicSum;
        System.out.println("Harmonik seri toplamı : " + harmonicSum);
        System.out.println("Harmonik Ortalama : " + harmonicMean);
    }
}
