//HEROUT

import java.io.*;

public class PocetZnaku {

    public static void main(String[] args) throws IOException {
        File frJm = new File("d:\\java\\h9\\soubory_pracovni\\clanek.txt");
        FileReader fr = new FileReader(frJm);

        FileWriter fw = new FileWriter("d:\\java\\h9\\soubory_pracovni\\clanek3.txt");
        BufferedWriter baf = new BufferedWriter(fw);
        
        long delka = frJm.length();
        int c;
        int[] znaky = new int[26];

        for (long i = 0; i < delka; i++) {
            c = fr.read();
            if( c>= 'a' && c <= 'z')
                znaky[c - 'a'] ++;
//            fw.write(c);
        }
        fr.close();
        
        
        for(int i = 0 ; i < znaky.length ; i++ ){
            System.out.println( (char) (i + 'a') + " :: " + znaky[i] );
            baf.write(" " + (char) (i + 'a') + " :: " + znaky[i]);
            baf.newLine();
        }
        baf.close();
        
    }
}
