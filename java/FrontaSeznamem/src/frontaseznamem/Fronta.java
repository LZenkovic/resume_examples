package frontaseznamem;

public class Fronta {
    
    Prvek prvni;
    Prvek posledni;
    
    void pridej(Prvek x){
        if(prvni == null){
            prvni = x; posledni = x;
        }else{
            posledni.dalsi = x;
            posledni = x;
        }
    }
    
    void vyridit(){
        if(prvni != null){
            System.out.println("vyrizuji prvek "+prvni.cislo);
            prvni = prvni.dalsi;
        }else{
            System.out.println("fronta je prazdna");
        }
    }
    
    void vypis(){
        Prvek walker;
        
        walker = prvni;
        while( walker != null ){
            System.out.println("#" + walker.cislo);
            walker = walker.dalsi;
        }
        
    }
    
}
