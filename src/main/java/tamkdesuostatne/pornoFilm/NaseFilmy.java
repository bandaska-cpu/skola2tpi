package tamkdesuostatne.pornoFilm;

import java.util.ArrayList;
import java.util.List;

public class NaseFilmy {

    public static void main(String[] args) {
        pornoherec Tomas = new pornoherec("Tomas Kvačkaj","Čvachtaj",19,12,13);
        pornoherec Jozka = new pornoherec("Jozef Pradlovsky","Buranský kocúr",19,2,1);
        pornoherecka Lana = new pornoherecka("amara maple","Lana Rhodes",3,15);
        pornoherecka mia = new pornoherecka("melisa annhevner","mia malkova",4,16);
        pornoherec cernoch = new pornoherec("Will smith","slapper",25,25,25);
        pornoherec cernoch2 = new pornoherec("morgan freeman","volny muz",22,24,30);
        pornoherec cernoch3 = new pornoherec("samuel L jackson","Richmond Valentine ",21,26,19);
        pornoherec cernoch4 = new pornoherec("koby","heli",25,27,20);


        List<pornoherec> pornoherci = new ArrayList<>();
        List<pornoherecka> pornohercky = new ArrayList<>();
        pornoherci.add(Tomas);
        pornoherci.add(Jozka);
        pornohercky.add(Lana);
        pornohercky.add(mia);
        pornoherci.add(cernoch);
        pornoherci.add(cernoch2);
        pornoherci.add(cernoch3);
        pornoherci.add(cernoch4);

        for(pornoherec pornoherec : pornoherci){
            System.out.println("dlzka ciciny " + pornoherec.getMenoPriezvisko() + " je " + pornoherec.getDlzkaCiciny() );
        }
        for(pornoherecka pornoherecka : pornohercky){
            System.out.println("dlzka Chacharuce " + pornoherecka.getMenoPriezvisko() + " je " + pornoherecka.getHlbkaCHacharuce() );
        }


    }

}
