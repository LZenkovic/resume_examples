package test2;
public class Kolecko 
{
    Prvek prvni;
    Prvek posledni;
    
    Kolecko()
    {
        
    }
    
    void pridej(Prvek x)
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
    
    void rotuj(int y)
    {
        Prvek walker;
        walker  = prvni;
        for (int i = 0; i < y; i++) 
        {
            if (walker == posledni)
            {
                if (walker.cislo == -1)
                {
                    System.out.println(walker.slovo);
                }
                else
                {
                    System.out.println(walker.slovo + " " + walker.cislo);
                }
                walker = prvni;
            }
            else
            {
                if (walker.cislo == -1)
                {
                    System.out.println(walker.slovo);
                }
                else 
                {
                    System.out.println(walker.slovo + " " + walker.cislo);
                }
                walker = walker.dalsi;
            }
        }
    }
}
