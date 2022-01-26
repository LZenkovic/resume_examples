//HEROUT

import java.io.*;

public class IoZnaky2 {
  public static void main(String[] args) throws IOException {
    File frJm = new File("d:\\java\\h9\\soubory_pracovni\\a.txt");
    FileReader fr = new FileReader(frJm);

    FileWriter fw = new FileWriter("d:\\java\\h9\\soubory_pracovni\\e.txt");

    long delka = frJm.length();
    int c;

    for (long i = 0;  i < delka;  i++) {
      c = fr.read();
      fw.write(c);
    }
    fr.close();
    fw.close();
  }
}
