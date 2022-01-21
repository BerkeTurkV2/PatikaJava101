import java.util.Scanner;

public class Yildizlar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz : ");
            int n = scanner.nextInt();
            int i,j,k;
            for(i=1; i<=n; i++){
                for(j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(k=1; k<=(2*i)-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }  
            for (i = (n-1); i>=0; i--) {
                for (j=1; j<=(n-i); j++) {
                    System.out.print(" ");
                }
                for (k=1; k<=(2*i)-1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            } 
        }
    }
}
