package tamkdesuostatne.tyden16;

public class entita {

    private int vek;
    private String meno;
    private int vyska;


    public entita(int vek, String meno, int vyska){
        this.meno = meno;
        this.vek = vek;
        this.vyska = vyska;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }
}
