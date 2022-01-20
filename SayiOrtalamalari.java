import java.util.Scanner;

public class SayiOrtalamalari {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz : ");
            int Sayi = scanner.nextInt();

            double Toplam = 0;
            int count =-1;

            for(int i = 0; i <=Sayi; i++){
                if((i%3 == 0) && (i%4 == 0)){
                    System.out.println(i);

                    Toplam = Toplam + i ;
                    count++;
                }
            }
            double Ortalama = Toplam / count;
            System.out.println("Bu " + count + " sayının ortalaması :  " + Ortalama);
        }
    }
}
