import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int GirisHak = 3;
            int Bakiye = 1500;
            int Select;

            while(GirisHak > 0){
                System.out.print("Kullanıcı Adınızı Giriniz : ");
                String UserName = scanner.nextLine();
        
                System.out.print("Şifrenizi Giriniz : ");
                String Password = scanner.nextLine();

                if(UserName.equals("BerkeTurk") && Password.equals("123")){
                    System.out.println("-----------------------------------------");
                    System.out.println("Merhaba bankamıza hoşgeldiniz.");
                    do{
                    System.out.println("-----------------------------------------");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println("-----------------------------------------");
                    System.out.println(" 1- Para Yatırma\n 2- Para Çekme\n 3- Bakiye Sorgulama\n 4- Çıkış Yap");
                    System.out.println("-----------------------------------------");
                    Select = scanner.nextInt();

                    switch(Select){
                        case 1:
                        System.out.print("Yatırmak istediğiniz miktarı yazınız : ");
                        int price = scanner.nextInt();
                        Bakiye = Bakiye + price;
                        break;
                        case 2:
                        System.out.print("Çekmek istediğiniz miktarı yazınız : ");
                        int Price = scanner.nextInt();
                        if(Bakiye < Price){
                            System.out.println("Hesabınızda yeterli miktarda para yoktur.");
                        }
                        else{
                            Bakiye = Bakiye - Price;
                        }
                        break;
                        case 3:
                        System.out.println("Bakiyeniz : " + Bakiye);
                        break;
                    }
                }
                while(Select != 4);
                    System.out.println("Çıkılıyor ...");
                    break;
                }
                
                else{
                    GirisHak --;
                    System.out.println("Hatalı kullanıcı adı veya şifre, Tekrar deneyiniz.");
                    switch(GirisHak){
                        case 0:
                        System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişeme geçiniz.");
                        break;
                        default:
                        System.out.println("Kalan hakkınız : " + GirisHak);
                    }
                }

            }
        
        }   
    }
}
