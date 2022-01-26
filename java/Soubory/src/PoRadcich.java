//HEROUT

import java.io.*;

public class PoRadcich {
  public static void main(String[] argv) throws IOException {
    
    FileReader fr = new FileReader("d:\\algo2_2018\\textovesoubory\\a.txt");
    BufferedReader in = new BufferedReader(fr);
    
    FileWriter fw = new FileWriter("d:\\algo2_2018\\textovesoubory\\g.txt");
    BufferedWriter out = new BufferedWriter(fw);
    String radka;

   
    
    while((radka = in.readLine()) != null) {
      System.out.print(radka);
      out.write(radka);
      out.newLine();
      //out.write("\n");
    }

    fr.close();
    out.close();
  }
}
