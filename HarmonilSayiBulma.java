import java.util.Scanner;

public class HarmonilSayiBulma {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("N sayısını giriniz : ");
            int n = scanner.nextInt();

            double sum = 0, i, x ;

            for(i=1; i<=n; i++){
                x = (1 / i) ;
                sum += x;
            }
            System.out.println(sum);
        }
    }
}
