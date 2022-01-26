
package boduseckakruznice2;

public class Hlavni {
    public static void main(String[] args) {
        Bod b1 = new Bod();
        b1.jmeno = 'A'; b1.x = 3; b1.y = 2;
        Bod b2 = new Bod();
        b2.jmeno = 'B'; b2.x = -2; b2.y = 2;
        
        b1.info(); b1.posun(7, 2); b1.info();
        
        Usecka u1 = new Usecka();
        u1.jmeno = 'k'; u1.m = b1; u1.n = b2;
        u1.info();

        u1.posun(10, 10);
        u1.info();

    }
}
