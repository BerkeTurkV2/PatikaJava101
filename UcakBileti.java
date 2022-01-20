import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Mesafeyi km türünden giriniz : ");
            int Mesafe = scanner.nextInt();

            System.out.print("Yaşınızı giriniz : ");
            int Yaş = scanner.nextInt();

            System.out.println("Yolculuk tipini giriniz:\n**********************\n1. Tek Yön\n2. Gidiş-Dönüş\n**********************");
            int Tip = scanner.nextInt();

            double KmUcret = 0.10;
            double Tutar = Mesafe*KmUcret;
            double YasIndirimi,TarifeIndirimi,IndirimliTutar,Toplam;
            double Indirim1 = 0.5;
            double Indirim2 = 0.1;
            double Indirim3 = 0.3;
            double Indirim4 = 0.2;

            if(!(Tip == 1) && !(Tip == 2) || !(Mesafe>0) || !(Yaş>0)){
                System.out.println("Hatalı Veri Girdiniz !");
            }
            else{
            if(Yaş<12){
                YasIndirimi = Tutar*Indirim1;
                IndirimliTutar = Tutar - YasIndirimi;
            }
            else if(Yaş<24){
                YasIndirimi = Tutar*Indirim2;
                IndirimliTutar = Tutar - YasIndirimi;
            }
            else if(Yaş>65){
                YasIndirimi = Tutar*Indirim3;
                IndirimliTutar = Tutar - YasIndirimi;
            }
            else{
                IndirimliTutar = Tutar;
            }
            if(Tip ==2){
                TarifeIndirimi = IndirimliTutar*Indirim4;
                Toplam = (IndirimliTutar-TarifeIndirimi) * 2;
            }
            else{
                Toplam = IndirimliTutar;
            }
            System.out.println("Toplam Tutar = " + Toplam);
         }
        }
    }
}
