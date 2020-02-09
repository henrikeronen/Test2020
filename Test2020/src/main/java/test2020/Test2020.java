package test2020;
public class Test2020 {
    public static void main(String[] args){
    
        Auto a = new Auto("Ford", "Escort");
        Rekka r = new Rekka("Scania", "VTF400");
        LinjaAuto la = new LinjaAuto("Volvo", "PowerBus1000");
        
        a.tulostaTiedot();
        r.tulostaTiedot();
        la.tulostaTiedot();
    
        
        
}

}
