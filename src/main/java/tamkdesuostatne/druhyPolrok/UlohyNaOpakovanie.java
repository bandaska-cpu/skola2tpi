package tamkdesuostatne.druhyPolrok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UlohyNaOpakovanie {
    static List<Integer> pole = Arrays.asList(10, 10, 10);

    public static void main(String[] args) {

        List<Integer> pole2 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);
        List<Integer> pole3 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);
        List<Integer> pole4 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);
        List<Integer> pole5 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);
        List<Integer> pole6 = Arrays.asList(1, 6, 8, 1, 6, 2, 6, 1, 3, 7);


    }

    static boolean nazov(List<Integer> pole) {

        if (pole.size() == 10) {
            int sucet = 0;
            for (int i : pole) {
                sucet = sucet + i;
            }
            if (sucet == 30) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}

