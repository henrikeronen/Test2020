package test2020;
public class Rekka extends Kulkuneuvo {

    private String merkki;
    private String malli;

    public Rekka(String merkki, String malli) {
        this.merkki = merkki;
        this.malli = malli;
    }

    public Rekka() {
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
        System.out.println("Rekkasi tiedot -->  Merkki: "+merkki+" ja malli:"+malli);
    }
    
    
}
