
package oddil;

public class Oddil {
    
    Clen prvni;
    Clen posledni;
    
    
    void pridej(Clen x){
        if(prvni == null){
            prvni = x; posledni = x;
        }else{
            posledni.dalsi = x;
            posledni = x;
        }
    }
   void nejmensiBMI(){
        Clen walker, min;
        
        walker = prvni;
        min = prvni;
        
        while( walker != null ){            
            if(min.BMI() > walker.BMI()){
                min = walker;
            }            
            walker = walker.dalsi;
        }
        System.out.print("Nejmenší BMI má: ");
        min.info();
   }
    
    void prehled(){
        Clen walker;
        
        walker = prvni;
        while( walker != null ){
            walker.info();
            walker = walker.dalsi;
        }
        
    }
    
}
