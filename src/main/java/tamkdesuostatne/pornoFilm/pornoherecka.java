package tamkdesuostatne.pornoFilm;

import java.util.ArrayList;
import java.util.List;

public class pornoherecka {

    String menoPriezvisko;
    String nick;
    double dostrik;
    double hlbkaCHacharuce;
    List<String> filmy = new ArrayList<>();


    public pornoherecka(){
    }

    public   String getMenoPriezvisko() {
        return menoPriezvisko;
    }

    public   String getNick() {
        return nick;
    }

    public   double getDostrik() {
        return dostrik;
    }

    public   double getHlbkaCHacharuce() {
        return hlbkaCHacharuce;
    }

    public   void setDostrik(double dostrik) {
        this.dostrik = dostrik;
    }

    public  void setHlbkaCHacharuce(double hlbkaCHacharuce) {
        this.hlbkaCHacharuce = hlbkaCHacharuce;
    }

    public pornoherecka(String menoPriezviskoo, String nickk, double dostrikk, double hlbkaCHacharucee){
        this.menoPriezvisko = menoPriezviskoo;
        this.nick = nickk;
        this.dostrik = dostrikk;
        this.hlbkaCHacharuce = hlbkaCHacharucee;
    }


    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);


    }


    @Override
    public String toString() {
        return "pornoherecka{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", nick='" + nick + '\'' +
                ", dostrik=" + dostrik +
                ", hlbkaCHacharuce=" + hlbkaCHacharuce +
                '}';
    }

    public void robiGangbang(List<pornoherec> pornoherci) {
    }
}
