
import java.io.*;

public class Clanek2 {

    public static void main(String[] argv) throws IOException {

        FileReader fr = new FileReader("d:\\algo2_2018\\textovesoubory\\text.txt");
        BufferedReader in = new BufferedReader(fr);

        String radka;
        int pocet = 0;
        int[] pole = new int['z' - 'a' + 1];
        

        while ((radka = in.readLine()) != null) {
            String[] kousek = radka.split(" ");
            pocet += kousek.length;

            for (int i = 0; i < radka.length(); i++) {
                if (radka.charAt(i) >= 'a' && radka.charAt(i) <= 'z') {
                    pole[radka.charAt(i) - 'a']++;
                }
            }
        }

        System.out.println("pocet slov je " + pocet);
        
        System.out.println("statistika znaku");
        for (int i = 0; i < pole.length; i++) {
            System.out.println( (char)(i + 'a') +  "#" + pole[i]);
        }
        fr.close();
    }
}
