package tamkdesuostatne.tyzden02;

public class Opakovanie {

    public static void main(String[] args) {
        int a = 69;
        float s = 15;
        double f = 656562326;
        long l = 1;
        byte e = 15;
        short p = 156;
        String ss = "fjakjn";
        char z = 'f';
        meno();
        boolean[] y = new boolean[]{};
        //y[0] = true;
        boolean[] y1 = new boolean[5];
        y1[0] = true;
        parnecisla(new int[]{5615,655,2535,5536,5855});
    }

    public static void meno() {
        String jj = "Stano";
        for (int x = 0; x < jj.length(); x++) {
            System.out.println(jj.charAt(x));
        }
    }

    public static String parnecisla(int[] p){
        int neparne = 0;
        int parne = 0;
        for (int x = 0;x<p.length;x++){
            if(p[x]%2==0){
                parne++;
            }
            else{
                neparne++;
            }
        }

        return "Parne cisla:"+parne+" neparne cisla:"+neparne;
    }
    }



