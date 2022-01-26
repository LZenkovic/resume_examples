package test1;
public class Oddil
{
    Clen prvni;
    Clen posledni;
    
    void pridej(Clen x)
    {
        if(prvni == null)
        {
            prvni = x;
            posledni = x;
        }
        else
        {
            posledni.dalsi = x;
            posledni = x;
        }
    }
    
    void prohled()
    {
        Clen walker;
        walker = prvni;
        while (walker != null)
        {
            walker.info();
            walker = walker.dalsi;
        }
    }
    
    void nejmensiBMI()
    {
        Clen min;
        Clen walker;
        walker = prvni;
        min = prvni;
        while (walker != null)
        {
            if (min.BMI() > walker.BMI())
            {
                min = walker;
            }
            walker = walker.dalsi;
        }
        min.info();
    }
}
