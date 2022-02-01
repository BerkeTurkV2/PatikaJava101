package MayinTarlasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
            System.out.println("===================================");
            System.out.println("Oluşturulacak haritanın büyüklüğünü belirleyiniz.");
            System.out.println("-----------------------------------");
            
            System.out.print("Satır sayısı : ");
            int x = scanner.nextInt();

            System.out.print("Sütun sayısı : ");
            int y = scanner.nextInt();

            MineSweeper mine = new MineSweeper(x, y);
            mine.run();
           
        }     
    }
}