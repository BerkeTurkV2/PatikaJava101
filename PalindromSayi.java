import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if(number == reverseNumber){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir Sayı Giriniz : ");
            int n = scanner.nextInt();

            System.out.println(isPalindrom(n));
        }
        
    }
}
