package tamkdesuostatne.druhyPolrok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class oneDalsiArrayListy {
    static List<Integer>pole = new ArrayList<>();
    public static void main(String[] args) {
        List<Integer> pole = new ArrayList<>();

        pridanieDoPola(3);
        pridanieDoPola(4);
        pridanieDoPola(4);
        pridanieDoPola(9);
        pridanieDoPola(5);
        vypisanePola() ;
        zoradeniePola();
        vypisanePola();

    }
    private static void vypisanePola(){
        System.out.println(pole.toString());
    }
    private static void zoradeniePola(){
        Collections.sort(pole);
    }
    private static void pridanieDoPola(int i){
        if(pole.contains(i)){
            System.out.println("element "+i+ "je uz v poli");
        }
        else {
            pole.add(i);
                    System.out.println("Element "+i+ " bol pridany ");
        }


    }
}
