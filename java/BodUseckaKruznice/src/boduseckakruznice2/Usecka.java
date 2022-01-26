
package boduseckakruznice2;

public class Usecka {
    char jmeno;
    Bod m;
    Bod n;
    
    void info(){
        System.out.println("-----------------------");
        System.out.println("Usecka " + jmeno + " je dlouha " + m.vzdalenost(n));
        //System.out.println("Usecka " + jmeno + " je dlouha " + delka());
        System.out.println("a bodu usecky jsou:");
        System.out.print("   "); m.info();
        System.out.print("   ");n.info();
        System.out.println("-----------------------");
    }
    double delka(){
        return m.vzdalenost(n);
    }
    void posun(double dx, double dy){
        m.posun(dx, dy); n.posun(dx, dy);
    }
}
