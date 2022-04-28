package tamkdesuostatne.druhyPolrok;

import java.util.ArrayList;

public class listy {
    public static void main(String[] args) {
    zaklady();
    }
    static void zaklady(){
        ArrayList<String> poleArrayList = new ArrayList<>();
        System.out.println(poleArrayList.size());
        poleArrayList.add(0,"stano");
        poleArrayList.add(1,"Patrik");
        poleArrayList.add(2,"ado");
        poleArrayList.add(3,"ursula");
        poleArrayList.add(4,"Peter");
        poleArrayList.toString();
        poleArrayList.remove(0);
        poleArrayList.set(0,"lukas");
        System.out.println(poleArrayList);
        ArrayList<Integer> pole = new ArrayList<>();
        System.out.println(pole.size());
        pole.add(0,5);
        pole.add(1,3);
        pole.add(2,1);
        System.out.println(pole);



        }
    }