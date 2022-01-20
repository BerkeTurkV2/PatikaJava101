import java.util.Scanner;

public class SayiKuvvetleri {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Sınır Sayısını Yazınız : ");
            int n = scanner.nextInt();

            for(int i = 1; i <=n; i*=4){
                System.out.println("Belirlenen sınır sayısına kadar 4 ün kuvvetleri : " + i);
            }
            System.out.println("*********************************************");
            for(int k = 1; k<=n; k*=5){
                System.out.println("Belirlenen sınır sayısına kadar 5 in kuvvetleri : " + k);
            }
        }
    }
}
