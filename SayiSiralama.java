import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("X Sayısını giriniz : ");
            int x = scanner.nextInt();

            System.out.print("Y Sayısını giriniz : ");
            int y = scanner.nextInt();

            System.out.print("Z Sayısını giriniz : ");
            int z = scanner.nextInt();

            if((x<y) && (x<z)){
                if(y<z){
                    System.out.println("x < y < z");
                }
                else{
                    System.out.println("x < z < y");
                }
            }
            else if((y<x) && (y<z)){
                if(x<z){
                    System.out.println("y < x < z");
                }
                else{
                    System.out.println("y < z < x");
                }
            }
            else if((z<x) && (z<y)){
                if(x<y){
                    System.out.println("z < x < y");
                }
                else{
                    System.out.println("z < y < x");
                }
            }

        }
    }
}
