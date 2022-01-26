package pole;

public class Hlavni {
    public static void main(String[] args) {
       
        int[] z;
        z = new int[10];
        
        z[0] = 5;
        z[1] = 10;
        z[2] = 15;
        
        int a = 7;
        z[a] = 3;
        z[a - 2] = 9;
        
        int soucet = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("prvek " + z[i]);
            soucet += z[i];
        }   
        System.out.println("soucet je " + soucet);
        System.out.println("prumer je " + (double)soucet/10);
    }  
}
