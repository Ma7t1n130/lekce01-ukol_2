import java.time.LocalDate;
class Prodejce{
    String Jmeno;
    String Prijmeni;
    LocalDate DatumNarozeni;
    int PocetSmluv;
    double CelkovaHmotnostMrkve;
    String Mesto;
    String SPZ;
    String IP;
    public Prodejce(String isJmeno,String isPrijmeni,LocalDate idDatumNarozeni,int inPocetSmluv,double inCelkovaHmotnostMrkve,String isMesto,String isSPZ,String isIP){
        Jmeno = isJmeno;
        Prijmeni = isPrijmeni;
        DatumNarozeni = idDatumNarozeni;
        PocetSmluv = inPocetSmluv;
        CelkovaHmotnostMrkve = inCelkovaHmotnostMrkve;
        Mesto = isMesto;
        SPZ = isSPZ;
        IP = isIP;
    }
    public double PrumerMrkveNaSmlouvu(){
        if (PocetSmluv>0) {
            return CelkovaHmotnostMrkve / PocetSmluv;
        }else{
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Prodejce P1 = new Prodejce("'Jan","Novak",LocalDate.of(2022,4,7),5,253,"Frýdek","1AB2345","192.168.1.1");
        System.out.println("Prodejce "+P1.Jmeno+" "+P1.Prijmeni+" má průměrně "+P1.PrumerMrkveNaSmlouvu()+" tun mrkve na smlouvu.");
    }
}