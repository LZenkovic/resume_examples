package test2;
public class Prvek 
{
    Prvek dalsi;
    String slovo;
    int cislo = -1;
    
    Prvek(String slovo,int cislo)
    {
        this.slovo = slovo;
        this.cislo = cislo;
    }
    
    Prvek(String slovo)
    {
        this.slovo = slovo;
    }

}
