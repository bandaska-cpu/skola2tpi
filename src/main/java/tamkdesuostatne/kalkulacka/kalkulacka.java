package tamkdesuostatne.kalkulacka;

public class kalkulacka {
    public static void main(String[] args) {
        scitanie(12,55);
        odcitanie(44 ,55);
        nasobenie(5 , 5);
        delenie(44,55);
    }
    static double scitanie(double x, double y){
        double z =x+y;
        System.out.println(z);
        return z;
    }
    static double odcitanie(double x, double y){
        double z =x-y;
        System.out.println(z);
        return z;
    }
    static double delenie(double x, double y){
        double z =x/y;
        if(y == 0){
            System.out.println("delenie nulou");
        }
        System.out.println(z);
        return z;
    }
    static double nasobenie(double x, double y){
        double z =x*y;
        System.out.println(z);
        return z;
    }
}
