//HEROUT

import java.io.*;

public class IoZnaky {
  public static void main(String[] args) throws IOException {
    File frJm = new File("d:\\java\\h9\\soubory_pracovni\\a.txt");
    File fwJm = new File("d:\\java\\h9\\soubory_pracovni\\b.txt");

    if (frJm.exists() == true) {
      FileReader fr = new FileReader(frJm);
      FileWriter fw = new FileWriter(fwJm);
      int c; 
      String pom;
      
      while ((c = fr.read()) != -1){
         System.out.print((char)c);
         c = Character.toUpperCase(c);
         
         fw.write(c);
      }
      fr.close();
      fw.close();
    }
  }
}
