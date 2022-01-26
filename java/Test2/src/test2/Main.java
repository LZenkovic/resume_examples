package test2;
public class Main 
{
    public static void main(String[] args) 
    {
        Kolecko kol = new Kolecko();
        
        kol.pridej(new Prvek("A",5));
        kol.pridej(new Prvek("B",0));
        kol.pridej(new Prvek("C",3));
        kol.pridej(new Prvek("D"));
        
        kol.rotuj(2);
    }
}
