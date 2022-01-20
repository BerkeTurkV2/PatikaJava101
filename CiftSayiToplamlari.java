import java.util.Scanner;

public class CiftSayiToplamlari {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int Toplam = 0;
            int Sayi;
            do{
                System.out.print("Sayı giriniz : ");
                Sayi = scanner.nextInt();

                if(Sayi%4 == 0){
                    Toplam = Toplam + Sayi;
                }
            }
            while(Sayi%2 == 0);

            System.out.println("Toplam " + Toplam);
        }
    }
}
