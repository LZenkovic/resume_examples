
package geometrie;

public class Hlavni {
    public static void main(String[] args) {
       
        Obdelnik a, b;
        a = new Obdelnik(15,10);
        System.out.println("obsah je " + a.obsah());
        
        b = new Obdelnik();
        b.nastavRozmery(8, 4);
        System.out.println("obsah je " + b.obsah());
        
        b = a;
        System.out.println("obsah je " + b.obsah());
        System.out.println("obsah je " + b.obsah());
        a.info();
    }
}
