import java.util.Scanner;

public class EtkinlikÖnerme {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Hava Sıcaklığını Giriniz : ");
            int Sıcaklık = scanner.nextInt();

            if(Sıcaklık<5){
                System.out.println("Kayak yapabilirsiniz.");
            }
            else if(Sıcaklık<15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            else if(Sıcaklık<25){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
            else{
                System.out.println("Yüzmeye gidebilirsiniz.");
            }
        }
    }
}
