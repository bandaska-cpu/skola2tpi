package tamkdesuostatne.tyden8;

public class Kruh {

    double r;
    double pi = Math.PI;
    double polomer;

    public Kruh(double vstupnyAtribut){
        if (vstupnyAtribut>0) {
            polomer = vstupnyAtribut;
        }
        else {
            polomer = 0;
        }

    }

    public double obvod(){
        return 2*pi*r;
    }
    public double obsah(){
        return pi*(r*r);
    }

    @Override
    public String toString() {
        return "Kruh{" +
                "r=" + r +
                ", pi=" + pi +
                '}';
    }
}
