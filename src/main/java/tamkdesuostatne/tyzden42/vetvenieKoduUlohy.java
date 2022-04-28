package tamkdesuostatne.tyzden42;

public class vetvenieKoduUlohy {

    public static void main(String[] args) {
        najvacsieCislo(65652 , 22312316 , 1);
        najvacsieCislo(65652 , 216 , 121511);
        najvacsieCislo(6565626 , 2216 , 5165);




    }
    static void najvacsieCislo(long x,long y, long z){


        if(x>y){
            if(x>z){
                System.out.println("x je najvacsie cislo");
            }
        }
         if(y>x){
            if(y>z){
                System.out.println("y je najvacsie cislo");
            }
        }
         if(z>x){
            if(z>y){
                System.out.println("z je najvacsie cislo");
            }
        }
    }
}
