package zasobnikseznamem;

public class Zasobnik {
    
    Prvek prvni;
    Prvek posledni;
    
    void pridej(Prvek x){
        if(prvni == null){
            prvni = x; posledni = x;
        }else{
            x.pred = posledni;
            posledni = x;
        }
    }
    
    void vyridit(){
        if(posledni != null){
            System.out.println("vyrizuji prvek "+posledni.cislo);
            posledni = posledni.pred;
        }else{
            System.out.println("zasobnik je prazdny");
        }
    }
    
    void vypis(){
        Prvek walker;
        
        walker = posledni;
        while( walker != null ){
            System.out.println("#" + walker.cislo);
            walker = walker.pred;
        }     
    }  
}
