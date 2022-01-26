
package dedicnostx2;

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

    public Clovek(int pohlavi) {
        super(pohlavi);
        System.out.println("konstruktor Clovek");
    }
    
    @Override
    void info(){
        System.out.println("jsem člověk");
    }
}

class Opice extends Organizmus{

    public Opice(int pohlavi) {
        super(pohlavi);
        System.out.println("konstruktor Opice");
    }
    
    @Override
    void info(){
        System.out.println("jsem opička ");
    }
}
