package dedicnostx3;

public class Hlavni {

    public static void main(String[] args) {

        Organizmus org;
        org = new Opice(2);
        org.info();
        org = new Clovek(1);
        org.info();

        Organizmus[] pole = new Organizmus[10];
        pole[0] = new Organizmus(1);
        pole[1] = new Opice(1);
        pole[5] = new Clovek(2);
        pole[6] = new Organizmus(1);
        pole[7] = new Opice(1);
        pole[9] = new Opice(2);

        System.out.println("výpis pole ---------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("prvek: " + pole[i]);
        }
        System.out.println("výpis info ---------------");
        for (int i = 0; i < 10; i++) {
            if (pole[i] != null) {
                pole[i].info();
                pole[i].vypisPohlavi();
            }
        }
        System.out.println("výpis 2 pole -------------");
        for (int i = 0; i < 10; i++) {
            if (pole[i] != null) {
                String text = pole[i].toString();
                System.out.println("text je: " + text);
            }
        }
    }
}
