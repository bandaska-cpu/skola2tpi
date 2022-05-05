package tamkdesuostatne.pornoFilm;



import java.util.ArrayList;
import java.util.List;
    // rodicovska trieda
    public class Herec {

        private String menoPriezvisko;
        private String pseudonym;
        List<String> filmy = new ArrayList<>();



        public Herec(String menoPriezvisko, String pseudonym) {
            this.menoPriezvisko = menoPriezvisko;
            this.pseudonym = pseudonym;

        }


        public String getMenoPriezvisko(){ return menoPriezvisko;}
        public String getPseudonym() {
            return pseudonym;
        }
        public void setMenoPriezvisko(String menoPriezvisko) {
            this.menoPriezvisko = menoPriezvisko;
        }
        public void setPseudonym(String pseudonym) {
            this.pseudonym = pseudonym;
        }




        public void pridatFilm(String nazovFilmu){
            filmy.add(nazovFilmu);

        }

        public boolean odobratFilm(String nazovFilmu){
            if(filmy.contains(nazovFilmu)){
                filmy.remove(nazovFilmu);
                return true;
            }
            else {
                return false;
            }
        }

    }