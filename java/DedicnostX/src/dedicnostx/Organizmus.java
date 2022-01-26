
package dedicnostx;


class Organizmus {
    int pohlavi;

    public Organizmus() {
        System.out.println("konstruktor Organizmus");
    }
    
}

class Clovek extends Organizmus{

    public Clovek(int pohlavi) {
        
        System.out.println("konstruktor Clovek");
        this.pohlavi = pohlavi;
    }
    
}
