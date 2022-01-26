package boduseckakruznice3;

public class Bod {
    char jmeno;
    double x;
    double y;
    
    void info(){
        System.out.println("Bod "+jmeno+" x="+x+" y="+y);
    }
    double vzdalenost(double sx, double sy){
        return Math.hypot( x - sx , y - sy );
    }
    double vzdalenost(Bod jinejBod){
        return Math.hypot( x - jinejBod.x , y - jinejBod.y );
    }
    void posun(double dx, double dy){
        x += dx; y += dy;
    }
}
