
package pole;

public class Hlavni2 {

    public static void main(String[] args) {
       
       int[]  cisla = {
           100, 500, 900,
           700, 200, 600,
           400, 800, 300, 1000
       };
       
        System.out.println("delka pole je " + cisla.length);
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(" " + cisla[i]);
        }
         int[] kopie = cisla; //mělká kopie
         
         //hluboka kopie rucne
         kopie = new int[cisla.length];
         for (int i = 0; i < cisla.length; i++) {
            kopie[i] = cisla[i];
         }
         //hluboka kopie knihovnou
        System.arraycopy(cisla, 0, kopie, 0, cisla.length);
        //System.arraycopy(cisla, 5, kopie, 0, cisla.length - 5);
        System.out.println("\n pole kopie:");
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(" " + kopie[i]);
        }
    }
    
}
