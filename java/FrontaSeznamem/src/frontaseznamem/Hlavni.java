
package frontaseznamem;

public class Hlavni {

    public static void main(String[] args) {
        
        Fronta fr = new Fronta();
        
        Prvek n = new Prvek(5);
        fr.pridej(n);
        
        fr.pridej( new Prvek(7) );
        fr.pridej( new Prvek(4) );
        fr.pridej( new Prvek(2) );
        fr.pridej( new Prvek(7) );
        fr.pridej( new Prvek(3) );
        fr.pridej( new Prvek(1) );
        
        fr.vypis();
        
        fr.vyridit(); fr.vyridit(); fr.vyridit();
        
        fr.vypis();
        
        fr.vyridit(); fr.vyridit(); fr.vyridit(); fr.vyridit(); fr.vyridit(); fr.vyridit();
        
        fr.pridej( new Prvek(27) );
        fr.vypis();
    }
    
}
