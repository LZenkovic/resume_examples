
package frontapolem;

public class Hlavni {

    public static void main(String[] args) {
        
        Fronta fr = new Fronta(5);
        fr.pridat(30);
        fr.pridat(40);
        fr.pridat(50);
        
        fr.vypisFrontu();
        
        fr.vypisPole();
        fr.vyridit();
        fr.vypisPole();
        
        fr.vypisFrontu();
        fr.vyridit();fr.vyridit();fr.vyridit();fr.vyridit(); 
        fr.vypisPole();
        
        fr.pridat(90);fr.pridat(100);fr.pridat(110);
        fr.pridat(90);fr.pridat(100);fr.pridat(110);
        fr.pridat(90);fr.pridat(100);fr.pridat(110);
        fr.pridat(90);fr.pridat(100);fr.pridat(110);
    }
}
