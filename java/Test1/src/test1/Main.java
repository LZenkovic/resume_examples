package test1;
public class Main 
{
    public static void main(String[] args) 
    {
        Oddil jedna = new Oddil();
        
        jedna.pridej(new Clen("Karel", 88, 192, 25));
        jedna.pridej(new Clen("Petra", 67, 163, 15));
        jedna.pridej(new Clen("Josef", 100, 188, 35));
        jedna.pridej(new Clen("Bob", 95, 170, 45));
        jedna.pridej(new Clen("David", 71, 15, 55));
        
        //jedna.prohled();
        
        
        jedna.nejmensiBMI();
        System.err.println(" ");
    }
    
}
