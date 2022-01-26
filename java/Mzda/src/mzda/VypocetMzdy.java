
package mzda;

public class VypocetMzdy {
   private double hruba;
   private static double dan;
   private static double socialni;

   
    public VypocetMzdy(double hr) {
        hruba = hr;
    }
    
    double pocitejCistou(){
        return hruba * (1 - dan - socialni);
    }
    double pocitejOdvody(){
        return hruba * (dan + socialni);
    }
    
    public static void nastavOdvody(double d, double s){
        if( d > 0 && s > 0 ){
            dan = d; socialni = s;
        }
    }
}
