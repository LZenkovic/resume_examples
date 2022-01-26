
package zasobnikseznamem;


public class Hlavni {

    public static void main(String[] args) {
        
        Zasobnik z = new Zasobnik();
        
        z.pridej( new Prvek(2) );
        z.pridej( new Prvek(5) );
        z.pridej( new Prvek(3) );
        z.pridej( new Prvek(1) );
        
        z.vypis();
        
        z.vyridit();
        z.vypis();
        
        z.vyridit();z.vyridit();z.vyridit();z.vyridit();z.vyridit();
        z.vypis();
        
        z.pridej( new Prvek(5) );
        z.pridej( new Prvek(3) );
        z.vypis();
    }
    
}
