
package frontaseznamem;

abstract class Organizmus {
    int pohlavi;
    int hmotnost;

    public Organizmus(int pohlavi, int hmotnost) {
        this.pohlavi = pohlavi;
        this.hmotnost = hmotnost;
    }

    public Organizmus(int pohlavi) {
        this.pohlavi = pohlavi;
        System.out.println("hmotnost zatím neměřitelná");
    }
    
    void vypisPohlavi(){
        System.out.println("Pohlavi je " + pohlavi);
    }
    
    abstract void info();
}

class Slon extends Organizmus{

    int delkaChobotu;

    public Slon(int delkaChobotu, int pohlavi, int hmotnost) {
        super(pohlavi, hmotnost);
        this.delkaChobotu = delkaChobotu;
    }
        
    
    @Override
    void info() {
        System.out.println("Jsem slon a můj chobot má délku = " + delkaChobotu);
    }
    
    
}

class Tygr extends Organizmus{

    int pocetZubu;

    public Tygr(int pocetZubu, int pohlavi, int hmotnost) {
        super(pohlavi, hmotnost);
        this.pocetZubu = pocetZubu;
    }
  
    @Override
    void info() {
        System.out.println("Jdem tygr a mám zubů: " + pocetZubu);
    }
    
}
