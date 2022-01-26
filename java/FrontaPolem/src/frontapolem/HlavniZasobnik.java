
package frontapolem;

public class HlavniZasobnik {

    public static void main(String[] args) {
        Zasobnik z = new Zasobnik(5);
        z.vypisZasobnik();
        z.pridat(1); z.pridat(2); z.pridat(3); 
        z.vypisZasobnik();
        z.vyridit();
        
        z.pridat(6); z.pridat(7); 
        z.vypisZasobnik();
        z.vyridit();
        
        z.vyridit();z.vyridit();z.vyridit();z.vyridit();
        z.pridat(1); z.pridat(2); z.pridat(3); z.pridat(1); z.pridat(2); z.pridat(3); 
        
    }
    
}
