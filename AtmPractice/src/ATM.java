import java.util.Scanner;

public class ATM {

    public void atm(Hesap hesap)
    {
         Login login = new Login();
         Scanner scanner = new Scanner(System.in);

         System.out.println("Hoşgeldiniz");

         System.out.println("Kullanıcı Girişi : ");

        int girisHakki;
        girisHakki = 3 ;

        while (true) {
            if( login.login(hesap))
            {
            System.out.println("Giriş Başarılı ");
            
                break;
            } 
            else
            {
                System.out.println("Giriş başarısız Tekrar deneyin");
                girisHakki = girisHakki- 1 ;
                System.out.println("Kalan giris Hakkınız" + girisHakki);

            }
            if(girisHakki == 0 )
            {
                System.out.println("Giris hakkınız tükendi");
                return;
            }
            
        }


        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        String islemler = "1 Bakiye Sorgulama " + " 2 Para yatırma" + " 3 para Çekme" + " 4 Çıkış";

        System.out.println(islemler);

        while (true) {
            System.out.println("Lutfen İşleminizi seçiniz:");
            String islem ; 
            islem = scanner.nextLine();

            
            if(islem.equals("1"))
            {
                System.out.println("Hesap bakineyiz = " + hesap.getBakiye());
            }
            else if (islem.equals("2"))
            {
                System.out.println("Yatıralacak tutarı giriniz:");
                int tutar;
                tutar = scanner.nextInt();
                hesap.paraYatir(tutar);
                System.out.println("Yeni bakiyeniz: " + hesap.getBakiye());
            }
            else if ( islem.equals("3"))
            {
                System.out.println("Çekilecek tutarı giriniz:");
                int tutar;
                tutar = scanner.nextInt();
                hesap.paraCek(tutar);
                System.out.println("Yeni bakiyeniz:" + hesap.getBakiye());

            }
            else if(islem.equals("4"))
            {
                break;
            }
            else
            {
                System.out.println("Yanlış giriş yaptınız...");
            }
            
        }




    }





}
