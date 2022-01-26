package test1;
public class Clen
{
    Clen dalsi;
    
    String jmeno;
    double vyska;
    double vaha;
    double body;
    
    public Clen(String jmeno, double vaha, double vyska, double body)
    {
        this.vaha = vaha;
        this.vyska = vyska;
        this.jmeno = jmeno;
        this.body = body;
    }
    
    double BMI()
    {
        return vaha / (vyska*vyska);
    }
    
    void info()
    {
        System.out.println("Clen: " + jmeno + ", BMI: " + BMI() + "body: " + body);
    }
}
