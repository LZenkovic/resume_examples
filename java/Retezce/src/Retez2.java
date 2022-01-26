//herout

public class Retez2 {
  public static void main(String[] args) {
    String s1, s2, s3, s4;
    s1 = new String("kuk");
    s2 = new String("kuk");
    s3 = new String("AHOJ");
    int k = 7;
    int b = 7;
    
    if(k == b){
        System.out.println("cisla stejne");
    }else{
        System.out.println("cisla jine");
    }
    
    if(s1 == s2){//srovnava reference na obj typu String, ale ne retezce
        System.out.println("stejne");
    }else{
        System.out.println("jine");
    }

    System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
    System.out.println("s2.compareTo(s1): " + s2.compareTo(s1));
    System.out.println("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));
    System.out.println("s1.equals(s3): " + s1.equals(s3));
    System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
  }
}
