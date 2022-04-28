package tamkdesuostatne.tyden12;

public class dogo {

    private String meno;
    private  String pohlavie;
    private   double vek;
    private  String rasa;


    public dogo(){

    }

    public dogo (String meno1,String pohlavie1,double vek1,String rasa1){
        this.rasa=rasa1;
        this.meno=meno1;
        this.vek=vek1;
        this.pohlavie=pohlavie1;
    }



    public void hrasa (){
        System.out.println(meno + " sa hra!!!!!");
    }

    public String getRasa(){
        return this.rasa;
    }

    public double getVek() {
        return vek;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public String getMeno() {
        return meno;
    }

    public void setVek(double vek) {
        if (vek>0) {
            this.vek = vek;
        }
    }



    public void hraSASFenou(dogo dogo1){
        if(dogo1.pohlavie =="fena"){
            System.out.println(meno + " hra sa s "+ dogo1.meno);
        }
        else{
            System.out.println(meno + " pokusal "+ dogo1.meno);
        }
    }

    @Override
    public String toString() {
        return "dogo{" +
                "meno='" + meno + '\'' +
                ", pohlavie='" + pohlavie + '\'' +
                ", vek=" + vek +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
