package tamkdesuostatne.druhyPolrok;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInterasionSort {
    public static void main(String[] args) {

        ArrayList<String>mojepole = new ArrayList<>();
        mojepole.add("janko");
        mojepole.add("patrik");
        mojepole.add("patrika");
        mojepole.add("igor");
        mojepole.add("ado");

        int test = Collections.binarySearch(mojepole,"igor");
        //System.out.println(mojepole.get(test));

        Collections.sort(mojepole);
        Collections.binarySearch(mojepole,"igor");

        test = Collections.binarySearch(mojepole,"igor");
        System.out.println(mojepole.get(test));


        //for (int i = 0 ; 1 < mojepole.size(); i++){
           // System.out.println("interacia"+i);
           // mojepole.remove(3);
           // System.out.println("po zmazani elementu" + mojepole);
       // }
        //manipulacia s polom
        int y = 0 ;
        for (String s : mojepole){
            System.out.println("interacia"+ y++);
            mojepole.remove(3);
            System.out.println("po zmazani elementu" + mojepole);
        }
    }
}
