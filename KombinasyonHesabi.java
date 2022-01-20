import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Kümenin eleman sayısını giriniz(n) : ");
            int n = scanner.nextInt();

            System.out.print("Alt kümelerin olmasını istediğiz eleman sayısını giriniz(r) : ");
            int r = scanner.nextInt();

            int nFak = 1, rFak = 1, nrFak = 1;

            for(int i=1; i<=n; i++){    
                nFak = nFak*i;
            }
            for(int k=1; k<=r; k++){
                rFak = rFak*k;
            }
            for(int z=1; z<=(n-r); z++){
                nrFak = nrFak*z;
            }
            int Kombinasyon = nFak / (rFak*nrFak);
            System.out.println(n + " sayılı kümenin " + r + " elemanlı kombinasyonu : " + Kombinasyon);
        }
    }
}
