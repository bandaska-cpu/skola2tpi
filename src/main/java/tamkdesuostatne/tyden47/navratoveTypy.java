package tamkdesuostatne.tyden47;

public class navratoveTypy {
    public static void main(String[] args) {
        String standa1 = vratistring(" more co si");
        vratistring("one sak ");
        vratistring("buran");
        //////////////////////////
        vratinic("standa");
        vratinic("more");
        vratinic("jejda");
        System.out.println(standa1);
        System.out.println(vratistring("Lubos"));

        System.out.println(vratiint("kfbgkhbfhrgdnjsabfnmabvhsdvbjsdobcdzshniurg"));

    }

    static String vratiString(String x) {
        return x;
    }

    ////////////////////////
    static void vratinic(String x) {
    }


    static String vratistring(String x ){
        String oprava = x + " 01";
        return oprava;
    }
    static int vratiint(String x){
        int z = x.length();
        return z;
    }

}
