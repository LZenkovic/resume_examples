package frontaseznamem;

public class Hlavni {

    public static void main(String[] args) {

        Fronta fronta = new Fronta();
        fronta.vypis();//prazdna fronta
        
        Organizmus x = new Slon(370, 1, 6700);
        fronta.pridej(new Prvek( x ));
        
        fronta.pridej(new Prvek( new Slon(240, 0, 5500) ));
        fronta.pridej(new Prvek( new Slon(480, 1, 7250) ));
        fronta.pridej(new Prvek( new Tygr(15, 1, 350) ));

        fronta.vypis();
        fronta.celkovaHmotnost();

        fronta.odbavit();
        fronta.odbavit();

        fronta.vypis();
        fronta.odbavit();
        fronta.odbavit();
        fronta.vypis();
    }
}
