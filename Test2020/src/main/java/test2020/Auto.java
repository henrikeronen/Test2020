package test2020;
public class Auto extends Kulkuneuvo{

    private String merkki;
    private String malli;

    public Auto() {
    }

    public Auto(String merkki, String malli) {
        this.merkki = merkki;
        this.malli = malli;
    }
    

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }


    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public void tulostaTiedot() {
        System.out.println("Autosi tiedot -->  Merkki: "+merkki+" ja malli:"+malli);
    }
    
    
}
