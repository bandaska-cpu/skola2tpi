package tamkdesuostatne.tyzden41;

public class cykliWhileaDoWhile {

    static int spolocnei  = 1;

    public static void main(String[] args)
    {ukazkaWhile( "stano");
        System.out.println("===================");
        ukazkaDoWhile("stano");}



    public static void ukazkaWhile(String meno){
        int i = spolocnei;
        while (i < 11) {
            System.out.println(i + " " +meno);
            i++;
        }
    }
    public static void ukazkaDoWhile(String meno1){
        int i = spolocnei;
        do{

        }while (i <11);

}
}