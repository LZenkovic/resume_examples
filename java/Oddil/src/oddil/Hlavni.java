
package oddil;


public class Hlavni {

    public static void main(String[] args) {
        
        Oddil o = new Oddil();
        o.pridej(new Clen("Karel", 1.75, 70, 35));
        o.pridej(new Clen("Miloš", 1.79, 81, 40));
        o.pridej(new Clen("Jiří", 1.85, 72, 36));
        o.pridej(new Clen("Břetislav", 1.81, 90, 38));
        o.pridej(new Clen("Hektor", 1.77, 76, 37));
        
        o.prehled();
        o.nejmensiBMI();
        
    }
    
}
