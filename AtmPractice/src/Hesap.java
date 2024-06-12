public class Hesap {
private String KullaniciAdi;
private String parola ;
private int bakiye;


public Hesap(String kullaniciAdi, String parola, int bakiye) {
    KullaniciAdi = kullaniciAdi;
    this.parola = parola;
    this.bakiye = bakiye;
}


public String getKullaniciAdi() {
    return KullaniciAdi;
}


public void setKullaniciAdi(String kullaniciAdi) {
    KullaniciAdi = kullaniciAdi;
}


public String getParola() {
    return parola;
}


public void setParola(String parola) {
    this.parola = parola;
}


public int getBakiye() {
    return bakiye;
}


public void setBakiye(int bakiye) {
    this.bakiye = bakiye;
}

public void paraYatir(int tutar)
{

    bakiye +=tutar;
    System.out.println("Yeni bakiyeniz: " + bakiye);

}

public void paraCek(int tutar)
{
    if(bakiye > tutar)
    {
        bakiye-=tutar;
        System.out.println("işlem başarılı yeni bakiyeniz : " + bakiye);
    }
    else
    {
        System.out.println("Yeterli bakiyeniz Yok " + bakiye);
    }

}





}
