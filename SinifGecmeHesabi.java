import java.util.Scanner;

public class SinifGecmeHesabi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Matematik notunuzu giriniz:");
            int Mat = scanner.nextInt();

            if((Mat <0 || Mat>100)){
                System.out.println("Geçerli bir not aralığı girmediğiniz için notunuz ortalamaya katılmamıştır.");
                Mat = 0;
            }

            System.out.print("Fizik notunuzu giriniz:");
            int Fizik = scanner.nextInt();

            if((Fizik <0 || Fizik>100)){
                System.out.println("Geçerli bir not aralığı girmediğiniz için notunuz ortalamaya katılmamıştır.");
                Fizik = 0;
            }

            System.out.print("Türkçe notunuzu giriniz:");
            int Türkce = scanner.nextInt();

            if((Türkce <0 || Türkce>100)){
                System.out.println("Geçerli bir not aralığı girmediğiniz için notunuz ortalamaya katılmamıştır.");
                Türkce = 0;
            }

            System.out.print("Kimya notunuzu giriniz:");
            int Kimya = scanner.nextInt();

            if((Kimya <0 || Kimya>100)){
                System.out.println("Geçerli bir not aralığı girmediğiniz için notunuz ortalamaya katılmamıştır.");
                Kimya = 0;
            }

            System.out.print("Müzik notunuzu giriniz:");
            int Müzik = scanner.nextInt();

            if((Müzik <0 || Müzik>100)){
                System.out.println("Geçerli bir not aralığı girmediğiniz için notunuz ortalamaya katılmamıştır.");
                Müzik = 0;
            }

            int Toplam = (Mat + Fizik + Kimya + Türkce + Müzik);
            double Ortalama = Toplam / 5 ;
            System.out.println("Ortalamanız : " + Ortalama);

            if(Ortalama >= 55){
                System.out.println("Sınıfı Geçtiniz, Tebrikler...");
            }
            else{
                System.out.println("Sınıfta Kaldınız, Seneye İnş...");
            }
        }
    }
    
}
