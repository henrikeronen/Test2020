package test2020;
public class Mopo extends Kulkuneuvo {

    private String merkki;
    private String malli;

    public Mopo(String merkki, String malli) {
        this.merkki = merkki;
        this.malli = malli;
    }

    public Mopo() {
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
        System.out.println("Moposi tiedot -->  Merkki: "+merkki+" ja malli:"+malli);
    }

    
}
