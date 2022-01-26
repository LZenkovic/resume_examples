package frontaseznamem;

class Prvek {
    Organizmus org;
    Prvek naslednik;

    Prvek(Organizmus x) {
        org = x;
    }
    void info(){
        org.info();
    }
}
