package tamkdesuostatne.pornoFilm;

import java.util.Arrays;
import java.util.List;

public class commons {

    public static List<pornoherec>pornoherci(){
        pornoherec Tomas = new pornoherec("Tomas Kvačkaj","Čvachtaj",19,12,13);
        pornoherec cernoch = new pornoherec("Will smith","slapper",25,25,25);
        pornoherec cernoch2 = new pornoherec("morgan freeman","volny muz",22,24,30);
        pornoherec cernoch3 = new pornoherec("samuel L jackson","Richmond Valentine ",21,26,19);
        pornoherec cernoch4 = new pornoherec("koby","heli",25,27,20);


        return Arrays.asList(Tomas,cernoch,cernoch2,cernoch3,cernoch4);
    }

    public static List<pornoherecka>pornoherecky(){
        pornoherecka Lana = new pornoherecka("amara maple","Lana Rhodes",3,15);
        pornoherecka mia = new pornoherecka("melisa annhevner","mia malkova",4,16);

        return Arrays.asList(Lana,mia);
    }
}
