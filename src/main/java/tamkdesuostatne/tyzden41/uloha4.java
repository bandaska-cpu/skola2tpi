package tamkdesuostatne.tyzden41;

public class uloha4 {
    public static void main(String[] args) {
        prepisanieNaWhile();
        cyklusapole();
        scitaniecisel();

    }

    static void cyklusapole() {

        int[] polecisel = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int nultyindex = polecisel[0];
        System.out.println(polecisel.length);
        for (int i = 0; i < polecisel.length; i++) {
            // System.out.println(polecisel[i]);
            System.out.println(i);
        }
    }

    static void scitaniecisel() {

        int vysledok = 0;
        for (int i = 1; i <= 10; i++) {

            vysledok = vysledok + i;
        }
        System.out.println(vysledok);
    }

    static void prepisanieNaWhile() {
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
    }
}

