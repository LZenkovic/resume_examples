//Herout

public class Retez3 {

    public static void main(String[] args) {
        String s = "mala a VELKA";
        int i;

        i = s.indexOf('a');
        System.out.println("Prvni a ma index " + i);
        i = s.indexOf('a', i + 1);
        System.out.println("Dalsi a ma index " + i);
        i = s.lastIndexOf('a');
        System.out.println("Posledni a ma index " + i);
        i = s.lastIndexOf('a', i - 1);
        System.out.println("Predposledni a ma index " + i);
        
        System.out.println("--------vypis indexu znaku a--------");
        i = -1;
        while (s.indexOf('a', i + 1) != -1) {
            i = s.indexOf('a', i + 1);
            System.out.println("# " + i);
        }
        //var 2 
        System.out.println("--------vypis indexu znaku a--------");
        i = -1;
        while ((i = s.indexOf('a', i + 1)) != -1) {
            System.out.println("# " + i);
        }
        //var 3
        System.out.println("--------vypis indexu znaku a--------");
        
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a' || s.charAt(j) == 'A') {
                System.out.println("# " + j);
            }
        }
    }
}
