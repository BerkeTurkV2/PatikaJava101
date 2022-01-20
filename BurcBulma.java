import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Doğduğunuz ayı yazınız:");
            String month = inp.nextLine();

            System.out.print("Doğduğunuz günü yazınız:");
            int day = inp.nextInt();

            if(month.equals("ocak")){

                if( day >= 1 && day <=21){
                    System.out.println("Burcunuz: Oğlak");
                }
                else if( day >21 && day <32){
                    System.out.println("Burcunuz: Kova");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("subat")){

                if( day >= 1 && day <=19){
                    System.out.println("Burcunuz: Kova");
                }
                if( day >19 && day <32){
                    System.out.println("Burcunuz: Balık");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("mart")){

                if( day >= 1 && day <=20){
                    System.out.println("Burcunuz: Balık");
                }
                if( day >20 && day <32){
                    System.out.println("Burcunuz: Koç");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("nisan")){

                if( day >= 1 && day <=20){
                    System.out.println("Burcunuz: Koç");
                }
                if( day >20 && day <32){
                    System.out.println("Burcunuz: Boğa");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("mayis")){

                if( day >= 1 && day <=21){
                    System.out.println("Burcunuz: Boğa");
                }
                if( day >21 && day <32){
                    System.out.println("Burcunuz: İkizler");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("haziran")){

                if( day >= 1 && day <=22){
                    System.out.println("Burcunuz: İkizler");
                }
                if( day >22 && day <32){
                    System.out.println("Burcunuz: Yengeç");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("temmuz")){

                if( day >= 1 && day <=22){
                    System.out.println("Burcunuz: Yengeç");
                }
                if( day >22 && day <32){
                    System.out.println("Burcunuz: Aslan");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("agustos")){

                if( day >= 1 && day <=22){
                    System.out.println("Burcunuz: Aslan");
                }
                if( day >22 && day <32){
                    System.out.println("Burcunuz: Başak");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("eylül")){

                if( day >= 1 && day <=22){
                    System.out.println("Burcunuz: Başak");
                }
                if( day >22 && day <32){
                    System.out.println("Burcunuz: Terazi");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("ekim")){

                if( day >= 1 && day <=22){
                    System.out.println("Burcunuz: Terazi");
                }
                if( day >22 && day <32){
                    System.out.println("Burcunuz: Akrep");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("kasim")){

                if( day >= 1 && day <=21){
                    System.out.println("Burcunuz: Akrep");
                }
                if( day >21 && day <32){
                    System.out.println("Burcunuz: Yay");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }

            if(month.equals("aralık")){

                if( day >= 1 && day <=21){
                    System.out.println("Burcunuz: Yay");
                }
                if( day >21 && day <32){
                    System.out.println("Burcunuz: Oğlak");
                }

                else{
                    System.out.println("Yanlış bilgi girdiniz.");
                }

            }
        }
    }
    
}
