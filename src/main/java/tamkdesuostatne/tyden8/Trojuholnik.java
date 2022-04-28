package tamkdesuostatne.tyden8;

public class Trojuholnik {

    double a;
    double b;
    double c;
    double v;

    public double obvod(){
        return a+b+c;
    }

    public double obsah(){
        return (a*v)/2;
    }

    public Trojuholnik(double vstupnyAtribut,double vstupnyAtribut1,double vstupnyAtribut2,double vstupnyAtribut3){
        if (vstupnyAtribut>0){
            a=vstupnyAtribut;
        }
        else {
            a=0;
        }
        if (vstupnyAtribut1>0){
            b=vstupnyAtribut1;
        }
        else {
            b=0;
        }
        if (vstupnyAtribut2>0){
            c=vstupnyAtribut2;
        }
        else {
            c=0;
        }
        if (vstupnyAtribut3>0){
            v=vstupnyAtribut3;
        }
        else {
            v=0;
        }
    }

    @Override
    public String toString() {
        return "Trojuholnik{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", v=" + v +
                '}';
    }
}
