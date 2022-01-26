
package pole;

import java.util.Arrays;

public class Hlavni3 {

    public static void main(String[] args) {
        
        int[]  cisla = {
           100, 500, 900,
           700, 200, 600,
           400, 800, 300, 1000
       };
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(" " + cisla[i]);
        }
        System.out.println();
        
        Arrays.sort(cisla);
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(" " + cisla[i]);
        }
        System.out.println();
        
        //razeni opacne / nouzova metoda
        for (int i = 0; i < cisla.length; i++){
            cisla[i] = -cisla[i];
        }
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(" " + cisla[i]);
        }
         System.out.println();
        Arrays.sort(cisla);
        for (int i = 0; i < cisla.length; i++){
            cisla[i] = -cisla[i];
        }
        //vypis
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(" " + cisla[i]);
        }
        System.out.println();
    }
    
}
