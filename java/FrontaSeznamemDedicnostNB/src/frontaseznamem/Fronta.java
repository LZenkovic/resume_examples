package frontaseznamem;

class Fronta {

    Prvek first;
    Prvek last;

    void pridej(Prvek novy) {
        
        if (first == null) {
            first = novy;
        } else {
            last.naslednik = novy;
        }
        last = novy;
        last.naslednik = null;//neni nutne
    }

    void vypis() {
        Prvek p;

        p = first;
        if (p == null) {
            System.out.print("fronta je prazdna");
        }

        while (p != null) {
            System.out.print("vypis: "); p.info();
            p = p.naslednik;
        }
        System.out.println();
    }

    void odbavit() {
        if (first != null) {
            System.out.print("vybiram: "); first.info();
            first = first.naslednik;
        }else{
            System.out.println("fronta je prazdna");
        }
    }
    void celkovaHmotnost(){
        Prvek p;
        int celkovaHmotnost = 0;
        p = first;
        if (p == null) {
            System.out.print("fronta je prazdna");
        }
        
        while (p != null) {
            celkovaHmotnost += p.org.hmotnost;
            p = p.naslednik;
        }
        System.out.println("Celkova hmotnost je " + celkovaHmotnost + " kg");
    }
}
