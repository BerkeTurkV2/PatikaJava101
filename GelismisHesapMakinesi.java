import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplamları : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Farkları : " + result);
        return result;
    }

    static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Çarpımları : " + result);
        return result;
    }

    static double divede(int a, int b) {
        int result = 0;
        if (b != 0) {
            result = a / b;
        } else {
            System.out.println("İkinci Sayı 0 olamaz.");
        }
        System.out.println("Bölümleri : " + result);
        return result;
    }

    static int exponential(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + " üzeri " + b + " : " + result);
        return result;
    }

    static int faktorial(int a, int b) {
        int result = 1;
        int result2 = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        for (int i = 1; i <= b; i++) {
            result2 *= i;
        }
        System.out.println(a + " sayısının faktöriyeli : " + result);
        System.out.println(b + " sayısının faktöriyeli : " + result2);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println(a + " nın " + b + " ye modu : " + result);
        return result;
    }

    static int rectangleArea(int a, int b) {
        int result = a * b;
        int result2 = 2 * (a + b);
        System.out.println("Kenarları " + a + " ve " + b + " olan dikdörtgenin alanı : " + result);
        System.out.println("Kenarları " + a + " ve " + b + " olan dikdörtgenin çevresi : " + result2);
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int select;
            System.out.println(
                    "1- Toplama İşlemi \n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme İşlemi\n5- Üslü Sayı Hesaplama\n6- Faktoriyel Hesaplama\n7- Mod Alma\n8- Dikdörtgen Alan ve Çevre Hesabı\n0- Çıkış Yap");
            do {
                System.out.println("-----------------------------------------------");
                System.out.print("Bir işlem seçiniz : ");
                select = scanner.nextInt();
                if (select > 8) {
                    System.out.println("Geçerli bir işlem seçiniz.");
                    continue;
                }
                System.out.println("-----------------------------------------------");
                System.out.print("Birinci sayıyı giriniz : ");
                int a = scanner.nextInt();
                System.out.println("-----------------------------------------------");
                System.out.print("İkinci sayıyı giriniz : ");
                int b = scanner.nextInt();
                System.out.println("-----------------------------------------------");
                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        multiplication(a, b);
                        break;
                    case 4:
                        divede(a, b);
                        break;
                    case 5:
                        exponential(a, b);
                        break;
                    case 6:
                        faktorial(a, b);
                        break;
                    case 7:
                        mod(a, b);
                        break;
                    case 8:
                        rectangleArea(a, b);
                        break;
                }

            } while (select != 0);
            System.out.println("Çıkış yapılıyor...");
        }
    }
}
