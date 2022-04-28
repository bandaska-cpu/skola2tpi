package tamkdesuostatne;

public class stringyPokracovanie {
    public static void main(String[] args) {
        jePalindrone("nevim");

    }
    static boolean jePalindrone(String SlovoNaKontrolu){
        for(int x = 0;x<SlovoNaKontrolu.length();x++){
            System.out.println(SlovoNaKontrolu.charAt(x));
        }
        for (int x = SlovoNaKontrolu.length()-1; x >= 0;x--){
            System.out.println(SlovoNaKontrolu.charAt(x));
            String slovo="";
            slovo = slovo + SlovoNaKontrolu.charAt(x);
            System.out.println(slovo);
        }
        return false;
    }
}
