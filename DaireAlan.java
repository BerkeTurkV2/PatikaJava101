import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Dairenin Yarıçapını Giriniz : ");
            int r = scanner.nextInt();

            System.out.print("Dairenin Merkez Açısı Ölçüsünü Giriniz : ");
            int a = scanner.nextInt();

            double Pi = 3.14;
            double Cevre = 2 *Pi*r;
            double Alan = Pi*r*r;
            double DaireDilimiAlanı = (Pi*(r*r)*a)/360;

            System.out.println("Dairenin Çevresi : " + Cevre);
            System.out.println("Dairenin Alanı : " + Alan);
            System.out.println("Daire Diliminin Alanı : " + DaireDilimiAlanı);

        }
    }
}
