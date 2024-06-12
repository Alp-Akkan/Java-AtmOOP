

public class App {
    public static void main(String[] args) throws Exception {
    
        ATM atm = new ATM();

        Hesap hesap = new Hesap("Alp", "akkan", 15000);

        atm.atm(hesap);

        



    }
}
