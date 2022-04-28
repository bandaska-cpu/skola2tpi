package tamkdesuostatne.tyzden41;

public class VytvaranieMetod {
    public static void main(String[] args) {
    polia();
    }

    static void metoda1(int x) {

    }

    static String metoda2(int x, String f) {

        return "Nevim";
    }

    static String metoda3(boolean z, String x) {

        return "Nevim";
    }

    static long metoda4() {

        return 546654665;
    }

    static String[] metoda5(int[] faf) {

        String[] x = new String[]{"dva", "tri", "štyri"};
        return x;
    }

    static void metoda6(boolean[] faf, int z) {

    }

    static boolean metoda7(String z, char x, long f) {
        return true;
    }

    static float metoda8(float z) {
        return 5052;
    }

    static boolean[] metoda9() {

        boolean a[] = {true, false, true, false};
        return a;

    }

    static void metoda10(boolean x) {
    }
    static void polia(){
        String[] x = new String[] {"dva","tri","štyri","päť","jeden"};
        char[] chars = new char[] {'f'};
        boolean [] g = new boolean[] {true,false,true,false,true};
        float [] floats = new float[] {12.545f,12.545f,12.545f,12.545f,12.545f};
        long [] longs = new long[] {15165L,15165L,15165L,24890L,47654L};
        for(int z = 0;z <x.length;z++){
            System.out.println(x[z]);
        }
        for(int l = 0;l<chars.length;l++){
            System.out.println(chars[l]);
        }
        for(int k = 0;k<g.length;k++){
            System.out.println(g[k]);
        }
        for(int j = 0;j<floats.length;j++){
            System.out.println(floats[j]);
        }
        for(int z = 0;z<longs.length;z++){
            System.out.println(longs[z]);
        }
    }



}



