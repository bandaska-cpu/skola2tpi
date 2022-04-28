package tamkdesuostatne.tyden16;

public class zena extends entita {

    private final String pohlavie="Zena";

    public zena(int vek,String meno,int vyska){
        super(vek,meno,vyska);
    }

    public String getPohlavie() {
        return pohlavie;
    }
}
