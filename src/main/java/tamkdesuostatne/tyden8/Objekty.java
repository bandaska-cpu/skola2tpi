package tamkdesuostatne.tyden8;

import tamkdesuostatne.tyzden44.test;

public class Objekty {
    public static void main(String[] args) {

        //vytvorili sme si objekt stvoruholnik a ulozili sme si ho do premeny stvoruholnik
            Stvoruholnik stvoruholnik = new Stvoruholnik(4,2);
            Trojuholnik trojuholnik = new Trojuholnik(2,2,3,2);
            Kruh Kruh2 = new Kruh(2.4);
            Stvoruholnik a = new Stvoruholnik(4,3);
            KontrolaPrimitivnychDatovyTypovAString test = new KontrolaPrimitivnychDatovyTypovAString();
            System.out.println(stvoruholnik.toString());
            System.out.println(trojuholnik.toString());
            System.out.println(Kruh2.toString());
            System.out.println(test.toString());
            System.out.println("obsah stvoruholnika je"+a.obsah());
            System.out.println("obvod stvoruholnika je"+a.obvod());
            System.out.println("obsah trojuholnika je"+trojuholnik.obsah());
            System.out.println("obvod trojuholnika je"+trojuholnik.obvod());
            System.out.println("obsah kruhu je"+ Kruh2.obsah());
            System.out.println("obbod kruhu je"+Kruh2.obvod());

            System.out.println(trojuholnik.obsah());

    }
}
