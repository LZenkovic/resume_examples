
package oddil;

public class Clen {
    
    Clen dalsi;
    
    String jmeno;
    double vyska;
    double vaha;
    int body;

    public Clen(String jmeno, double vyska, double vaha, int body) {
        this.jmeno = jmeno;
        this.vyska = vyska;
        this.vaha = vaha;
        this.body = body;
    }
    
    double BMI(){
        return vaha / (vyska * vyska);
    }
    
    void info(){
        System.out.println("člen: " + jmeno + ", BMI="+BMI()+", body="+body);
    }
    
}
