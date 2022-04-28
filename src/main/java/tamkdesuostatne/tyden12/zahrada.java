package tamkdesuostatne.tyden12;

public class zahrada {

    public static void main(String[] args) {
        dogo dustin = new dogo("dustin","pes",4,"nemecky ovcak");
        dogo rex = new dogo("rex","pes",4,"krizeny");
        dogo jozka = new dogo("jozka","fena",15,"civava");


        dustin.hrasa();
        rex.hrasa();
        jozka.hrasa();
        jozka.hraSASFenou(dustin);
        dustin.hraSASFenou(rex);
        dustin.hraSASFenou(jozka);
        System.out.println("Jozka je " + jozka.getRasa());
        System.out.println("Jozka je "+ jozka.getPohlavie());
        System.out.println("Meno psa je "+ jozka.getMeno());
        jozka.setVek(-71);
        System.out.println(jozka.getVek());

    }
}
