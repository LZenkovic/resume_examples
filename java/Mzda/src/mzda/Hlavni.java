
package mzda;

public class Hlavni {

    public static void main(String[] args) {
        VypocetMzdy m1, m2, m3;
        m1 = new VypocetMzdy(19500);
        m2 = new VypocetMzdy(23500);
        m3 = new VypocetMzdy(28000);
        
        System.out.println("cista m2 " + m2.pocitejCistou() );
        VypocetMzdy.nastavOdvody(0.15, 0.05);
        System.out.println("cista m1 " + m1.pocitejCistou() );
        System.out.println("cista m2 " + m2.pocitejCistou() );
        System.out.println("cista m3 " + m3.pocitejCistou() );
        
        m1.nastavOdvody(0.25, 0.1);
        //nejde: m1.dan = 0.30;

    }
    
}
