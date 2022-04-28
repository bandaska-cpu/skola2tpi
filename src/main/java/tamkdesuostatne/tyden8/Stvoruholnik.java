package tamkdesuostatne.tyden8;

public class Stvoruholnik {

    double stranaA;
    double stranaB;

    public double obvod() {
        return 2*(stranaA+stranaB);
    }

    public double obsah() {
        return stranaB*stranaA;

    }
    public Stvoruholnik(double vstupnyAtribut,double vstupnyAtribut1){
        if (vstupnyAtribut>0) {
            stranaB = vstupnyAtribut;
        }
        if (vstupnyAtribut1>0){
            stranaA = vstupnyAtribut1;
        }
        else{
            stranaA = 0;
            stranaB = 0;
        }
    }




    @Override
    public String toString() {
        return "Stvoruholnik{" +
                "stranaA=" + stranaA +
                ", stranaB=" + stranaB +
                '}';
    }
}