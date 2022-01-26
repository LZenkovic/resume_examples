//HEROUT

import java.io.*;

public class Clanek {
  public static void main(String[] argv) throws IOException {
    
    FileReader fr = new FileReader("d:\\algo2_2018\\textovesoubory\\clanek.txt");
    BufferedReader in = new BufferedReader(fr);
    
    FileWriter fw = new FileWriter("d:\\algo2_2018\\textovesoubory\\clanek2.txt");
    BufferedWriter out = new BufferedWriter(fw);
    String radka;


    while((radka = in.readLine()) != null) {
      System.out.print(radka);
      String[] kousek = radka.split(" ");
      for(int i = 0  ; i < kousek.length ; i ++ ){
//       out.write(kousek[i].toUpperCase());
//        out.write(" ");
//        out.write( kousek[i].length() );
//        out.write(String.valueOf(  kousek[i].length()  )   );
        out.write( kousek[i].toUpperCase() + " " + kousek[i].length() );
        out.newLine();
      }
    }
    fr.close();
    out.close();
  }
}
