package tamkdesuostatne.pornoFilm;

import java.util.ArrayList;
import java.util.List;

public class pornoherec extends herec {

    String menoPriezvisko;
    String nick;
    double objemVacku;
    double dlzkaCiciny;
    double dostrek;
    List<String> filmy = new ArrayList<>();
    final double objemJednehoStriku = 6.2;

    public void setObjemVacku(double objem){
        if (objem == 0){
            objemVacku = 0;
        }else {
            objemVacku = objem;
        }
    }

    public double SetobjemVacku(){
        return objemVacku;
    }


    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);
        objemVacku =objemVacku - objemJednehoStriku;

    }


    public  String getMenoPriezvisko() {
        return menoPriezvisko;
    }

    public   String getNick() {
        return nick;
    }

    public   double getObjemVacku() {
        return objemVacku;
    }

    public  double getDlzkaCiciny() {
        return dlzkaCiciny;
    }

    public double getDostrek() {
        return dostrek;
    }

    public  double getObjemJednehoStriku() {
        return objemJednehoStriku;
    }


    public  void setDlzkaCiciny(double dlzkaCiciny) {
        this.dlzkaCiciny = dlzkaCiciny;
    }

    public   void setDostrek(double dostrek) {
        this.dostrek = dostrek;
    }

    public pornoherec(){

        super("test","test");

    }

    public pornoherec(String menoPriezviskoo,String nickk,double objemVackuu , double dlzkaCicinyy,double dostrekk){
        this.menoPriezvisko = menoPriezviskoo;
        this.nick = nickk;
        this.objemVacku = objemVackuu;
        this.dlzkaCiciny = dlzkaCicinyy;
        this.dostrek = dostrekk;
    }


    @Override
    public String toString() {
        return "pornoherec{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", nick='" + nick + '\'' +
                ", objemVacku=" + objemVacku +
                ", dlzkaCiciny=" + dlzkaCiciny +
                ", dostrek=" + dostrek +
                ", filmy=" + filmy +
                '}';
    }


}
