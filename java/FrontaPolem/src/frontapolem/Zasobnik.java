package frontapolem;

public class Zasobnik {

    private int[] pole;
    private int pocet = 0;

    Zasobnik(int delka) {
        pole = new int[delka];
    }

    public void pridat(int x) {
        if (pocet >= pole.length) {
            System.out.println("je plno");
        } else {
            pole[pocet] = x;
            pocet++;
        }
    }

    public void vyridit() {
        //vyridi prvek tak, ze ho vypise
        if (pocet > 0) {
            System.out.println("vyrizuji: " + pole[--pocet]);           
        } else {
            System.out.println("zasobnik je prazdny");
        }
    }

    private void posun() {//posun vzdy po vyrizeni
        for (int i = 1; i <= pocet - 1; i++) {
            pole[i - 1] = pole[i];
        }
    }

    public void vypisZasobnik() {
        if (pocet == 0) {
            System.out.println("zasobnik je prazdny");
        } else {
            for (int i = pocet - 1; i >= 0 ; i--) {
                System.out.println("prvek: " + pole[i]);
            }
        }
    }

    public void vypisPole() {
        for (int i = 0; i < pole.length; i++) {
            System.out.print(" # " + pole[i]);
        }
        System.out.println();
    }
}
