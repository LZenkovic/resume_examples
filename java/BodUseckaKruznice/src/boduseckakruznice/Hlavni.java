
package boduseckakruznice;

public class Hlavni {
    public static void main(String[] args) {
       
        Bod b1 = new Bod();
        b1.jmeno = 'A'; b1.x = 3; b1.y = 2;
        b1.info();
        Bod b2 = new Bod();
        b2.jmeno = 'B'; b2.x = -2; b2.y = 2;
        b2.info();
        double V = Math.sqrt( Math.pow(b1.x-b2.x,2) + Math.pow(b1.y-b2.y,2) );
                   //Math.hypot(b1.x-b2.x, b1.y-b2.y);
        System.out.println("Vzdalenost je " + V);
        System.out.println("Vzdalenost b2 od pocatku je  "+b2.vzdalenost(0, 0));
        System.out.println("Vzdalenost b2 od b1 je  "+b2.vzdalenost(b1.x, b1.y));
        System.out.println("Vzdalenost b2 od b1 je  "+b2.vzdalenost(b1));
    }               
}
