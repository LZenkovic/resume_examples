//HEROUT
import java.io.*;

public class IoBajty {
  public static void main(String[] args) throws IOException {
    File frJm = new File("d:\\java\\h9\\soubory_pracovni\\a.txt");
    File fwJm = new File("d:\\java\\h9\\soubory_pracovni\\c.txt");

    if (frJm.exists() == true) {
      FileInputStream fr = new FileInputStream(frJm);
      FileOutputStream fw = new FileOutputStream(fwJm);

      int c; 

      while (  (c = fr.read() )   !=   -1)
        fw.write(c);

      fr.close();
      fw.close();
    }
  }
}
