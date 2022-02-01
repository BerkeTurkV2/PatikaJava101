package MayinTarlasi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rowNumber;
    int colNumber;
    int win = 0, counter = 0;
    int mine;
    boolean isWin;
    String[][] map;
    String[][] map2;

    public void printArr(String[][] arr) {
        System.out.println("===================================");
        System.out.println(" **** HARİTA ****");
        for (String[] row : arr) {
            for (String col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mine = (rowNumber * colNumber) / 4;
        this.isWin = true;

        this.map = new String[rowNumber][colNumber];
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.map[i][j] = "-";
            }
        }
        this.map2 = new String[rowNumber][colNumber];
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.map2[i][j] = "-";
            }
        }
    }

    void run() {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            System.out.println("===================================");
            System.out.println(" **** MAYINLARIN KONUMU ****");
            int k = 0, i, j;
            for (String[] str : map) {
                Arrays.fill(str, " - ");
            }
            while (k < mine) {
                i = random.nextInt(rowNumber);
                j = random.nextInt(colNumber);
                if (map[i][j] != " * ") {
                    map[i][j] = " * ";
                    k++;
                }
            }
            for (i = 0; i < rowNumber; i++) {
                for (j = 0; j < colNumber; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
            int row = this.rowNumber;
            int col = this.colNumber;

            while (isWin) {
                printArr(this.map2);

                if (win == (this.rowNumber * colNumber) - ((this.rowNumber * this.colNumber) / 4)) {
                    System.out.println("Tebrikler oyunu kazandiniz!");
                    printArr(this.map);
                    break;
                }
                System.out.print("Satir giriniz : ");
                row = input.nextInt();
                System.out.print("Sütun giriniz : ");
                col = input.nextInt();

                if (row >= this.rowNumber || col >= this.colNumber || row < 0 || col < 0) {
                    System.out.println("===================================");
                    System.out.println("Harita dışında bir alan seçtiniz !");
                    System.out.println("Konumu Tekrar Giriniz.");
                    System.out.println("===================================");
                } else {
                    if (map[row][col] == (" * ")) {
                        System.out.println("BOOMM! Mayına Bastınız. Game Over!");
                        isWin = false;
                    } else {
                        for (i = row - 1; i <= row + 1; i++) {
                            for (j = col - 1; j <= col + 1; j++) {
                                try {
                                    if (i == row && j == col) {
                                        continue;
                                    } else if (map[i][j] == (" * ")) {
                                        counter++;
                                    }
                                } catch (Exception ignored) {
                                }
                            }
                        }
                        win++;
                        this.map2[row][col] = Integer.toString( counter );
                        counter = 0;
                    }
                }
            }
        }
    }
}
