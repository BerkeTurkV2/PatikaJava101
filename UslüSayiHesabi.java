import java.util.Scanner;

public class UslüSayiHesabi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz : ");
            int x = scanner.nextInt();

            System.out.print("Üse gelecek sayıyı yazınız : ");
            int y = scanner.nextInt();

            int Toplam = 1;

            for(int i=1; i<=y; i++){
                Toplam *= x;
                
            }
            System.out.println(Toplam);
        }
    }
    
}
