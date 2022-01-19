import java.util.Scanner;

public class ÜcgenAlan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Üçgenin Alt uzunluğunu yazınız: ");
            int a = scanner.nextInt();

            System.out.print("Üçgenin Yan uzunluğunu yazınız : ");
            int b = scanner.nextInt();

            double c = Math.sqrt((a*a) + (b*b)) ;

            System.out.println("Üçgenin Hipotenüs Uzunluğı : " + c );

            System.out.println("Üçgenin Çevresi : " + (a+b+c));

            double u = (a+b+c) / 2 ;
            double Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

            System.out.println("Üçgenin Alanı : " + Alan);
            
        }
    }
}
