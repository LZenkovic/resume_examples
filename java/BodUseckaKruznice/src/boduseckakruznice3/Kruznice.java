
package boduseckakruznice3;

public class Kruznice {
    Bod s;
    double r;
    char jmeno;
    
    void vzajPoloha(Kruznice x){
       double vz = s.vzdalenost(x.s); //x.s.vzdalenost(s);
       double soucetPolomeru = r + x.r;
       if( vz > soucetPolomeru){
           System.out.println("KRUZNICE lezi mimo");
       }
       if( vz == soucetPolomeru ){
           System.out.println("KRUZNICE lezi na kruznici");
       }
       if( vz < soucetPolomeru ){
           System.out.println("KRUZNICE lezi uvnitr kruznice");
       }
    }
    
    void vzajPoloha(Bod x){
       double vz = x.vzdalenost(s); 
       if( vz > r ){
           System.out.println("bod lezi mimo");
       }
       if( vz == r ){
           System.out.println("bod lezi na kruznici");
       }
       if( vz < r ){
           System.out.println("bod lezi uvnitr kruznice");
       }
    }
    void posun(double dx, double dy){
        s.posun(dx, dy);
    }
    void zmenaVelikosti(double xkrat){
        r *= xkrat;
    }
            
}
