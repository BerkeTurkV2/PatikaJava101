import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz : ");
            int Sayi = scanner.nextInt();
            int Sum = 0 ;

            while(Sayi != 0){   
                int x = Sayi % 10;
                Sum += x;
                Sayi = Sayi / 10;
            }
            System.out.println("Basamak sayıları toplamı : " + Sum);
        }
    }
}
