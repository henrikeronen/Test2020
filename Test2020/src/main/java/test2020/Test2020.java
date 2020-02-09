package test2020;
public class Test2020 {
    public static void main(String[] args){
    
        Auto a = new Auto("Ford", "Escort");
        Rekka r = new Rekka("Scania", "VTF400");
        LinjaAuto la = new LinjaAuto("Volvo", "PowerBus1000");
        Auto a2 = new Auto("Kia", "Ceed");
        Mopo m = new Mopo("Honda","CBR250R");
        
        a.tulostaTiedot();
        r.tulostaTiedot();
        la.tulostaTiedot();
        
        a2.tulostaTiedot();
        m.tulostaTiedot();
        
        System.out.println("Kaikki toimii OK!");
        
    
        
        
}

}
