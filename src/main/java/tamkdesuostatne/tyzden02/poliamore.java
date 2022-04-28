package tamkdesuostatne.tyzden02;

import java.util.Arrays;

public class poliamore {
    public static void main(String[] args) {
        System.out.println(Stano(new int[]{615,948,16,26,55,6,4,9}));
        boolean[] bol = new boolean[5];
        int[] in = new int[5];
        char[] cg = new char[5];
        String[] a = new String[5];
        byte[] b = new byte[5];
        long[] l = new long[5];
        System.out.println(Arrays.toString(bol));
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(cg));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(l));
    }
    public static int Stano(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
}
