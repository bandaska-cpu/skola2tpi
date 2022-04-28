package tamkdesuostatne.tyzden41;

public class matematickeUlohy {
    public static void main(String[] args) {
        int[] pole = new int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295} ;
        nicneco(pole);
        System.out.println(nicneco(pole));
        System.out.println(nicneco(new int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295} ));
    }


static int nicneco(int[] poletejtometody){

        int x =0;
        int vysledok= 0;

        for(int i = 0; i < poletejtometody.length; i++){
            if (poletejtometody[i] % 2 == 0){
                if ( Math.sqrt(poletejtometody[i])<4);
                {
                    vysledok=vysledok+poletejtometody[i];
                }
            }
        }
        System.out.println(vysledok);
        return vysledok;


    }
}
