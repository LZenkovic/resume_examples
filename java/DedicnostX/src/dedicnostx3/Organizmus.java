
package dedicnostx3;


class Organizmus {
    int pohlavi;

    public Organizmus(int pohlavi) {
        this.pohlavi = pohlavi;
        System.out.println("konstruktor Organizmus");
    }    
    
    void vypisPohlavi(){
        System.out.println("Pohlavi je " + pohlavi);
    }
    void info(){
        System.out.println("jsem organizmus");
    }
}

class Clovek extends Organizmus{
    
    int majetek;
    
    public Clovek(int pohlavi) {
        super(pohlavi);
        System.out.println("konstruktor Clovek");
        majetek = (int)( 1000000* ( Math.random() + 0.5 ) );
    }
    
    @Override
    void info(){
        System.out.println("jsem člověk");
    }
    void vypisStavKonta(){
        System.out.println("Hodnota majetku " + majetek + " USD");
    }
}

class Opice extends Organizmus{

    int pocetChlupu;
    
    public Opice(int pohlavi) {
        super(pohlavi);
        System.out.println("konstruktor Opice");
        pocetChlupu = (int)( 1000000*Math.random() );
    }
    
    @Override
    void info(){
        System.out.println("jsem opička ");
    }
    
    void vypisPocetChlupu(){
        System.out.println("počet chlupů je " + pocetChlupu);
    }
}
