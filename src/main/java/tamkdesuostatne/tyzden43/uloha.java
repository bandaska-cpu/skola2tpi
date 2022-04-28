package tamkdesuostatne.tyzden43;

public class uloha {
    public static void main(String[] args) {
     parnycislo(201);prestupny(1600);
    }

    public static void parnycislo(int x) {

        if (x % 2 == 0)  {
            System.out.println("cislo " + x+ " je parnegit");
        } else {
            System.out.println("cislo " + x + " je neparne");
        }
    }
    public static void prestupny(int pr){
        if(pr %4==0){
            if(pr %100==0){
                if(pr %400==0){
                    System.out.println("rok "+pr+" je prestupny");
                }
                else {
                    System.out.println("rok"+pr+ "neni prestupny");
                }
            }
            else{
                System.out.println("rok "+pr+" je prestupny");
            }
        }
        else{
            System.out.println("rok"+pr+"neni prestupny");
        }
    }
}
