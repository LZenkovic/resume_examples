
package boduseckakruznice3;

public class Hlavni {
 public static void main(String[] args) {
        Bod b1, b2, b3, b4, b5;
        b1 = new Bod();b2 = new Bod();b3 = new Bod();b4 = new Bod();b5 = new Bod();
        b1.jmeno = 'A'; b1.x = 2; b1.y = 3;
        b2.jmeno = 'B'; b1.x = 4; b1.y = 3;
        b3.jmeno = 'C'; b1.x = 2; b1.y = 8;
        b4.jmeno = 'D'; b1.x = 7; b1.y = 3;
        b5.jmeno = 'E'; b1.x = 2; b1.y = 0;
        Kruznice k1, k2, k3;
        k1 = new Kruznice(); k2 = new Kruznice(); k3 = new Kruznice();
        k1.jmeno = 'l'; k1.r = 4; k1.s = b1;
        k2.jmeno = 'm'; k2.r = 1; k2.s = b2;
        k3.jmeno = 'n'; k3.r = 4; k3.s = b3;
        
        k1.vzajPoloha(k3);
        k2.vzajPoloha(k3);
        k3.vzajPoloha(b5);
        k1.posun(20, 30);
        k1.vzajPoloha(k3);          
    }
}
