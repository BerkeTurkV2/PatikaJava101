import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Yıl Giriniz : ");
            int Yıl = scanner.nextInt();

            if(Yıl%4 == 0){
                if(Yıl % 100 == 0 && Yıl % 400 != 0){
                    System.out.println(Yıl + " bir artık yıl değildir.");
                }
                else{
                    System.out.println(Yıl + " bir artık yıldır.");
                }
            }
            else{
                System.out.println(Yıl + " bir artık yıl değildir.");
            }
        }
    }
}
