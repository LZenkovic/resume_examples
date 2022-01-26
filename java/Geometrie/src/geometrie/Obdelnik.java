
package geometrie;


public class Obdelnik {
    private int sirka;
    private int vyska;

    Obdelnik(int s, int v) {
        if( s > 0 && v > 0){
            sirka = s; vyska = v;
        }else{
            System.out.println("zadany neplatne parametry");
        }
    }
    
    Obdelnik(){
        System.out.println("vytvoril jsem prazdny obdelnik");
    }
    
    void nastavRozmery(int s, int v){
        if( s > 0 && v > 0){
            sirka = s; vyska = v;
        }else{
            System.out.println("zadany neplatne parametry");
        }
    }
    
    int obsah(){
        return sirka * vyska;
    }
            
    void info(){
        System.out.println(" obdelnik s rozmery "
                +sirka+"x"+vyska+" a obsah je " + obsah() );
    }
}
