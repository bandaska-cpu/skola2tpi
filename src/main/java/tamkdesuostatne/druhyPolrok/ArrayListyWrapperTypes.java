package tamkdesuostatne.druhyPolrok;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListyWrapperTypes {
    public static void main(String[] args) {
        int [] x = new int[]{66,4,6};
        ArrayList<Integer> o = new ArrayList<>();
        o.add(154);
        o.add(566);
        o.add(68);
        ArrayList<Integer> test08 = new ArrayList(Arrays.asList(o));
        short[] v = new short[]{6,4,5};
        ArrayList<Short> j = new ArrayList<>();
        j.add((short) 6);
        j.add((short) 69);
        j.add((short) 66);
        ArrayList<Short> test07 = new ArrayList(Arrays.asList(j));
        long [] q = new long[]{8,9,5};
        ArrayList<Long> g = new ArrayList<>();
        g.add(695L);
        g.add(655L);
        g.add(9L);
        ArrayList<Long> test06 = new ArrayList(Arrays.asList(g));
        float [] d =new float[]{5,26,8};
        ArrayList<Float> t = new ArrayList<>();
        t.add(32f);
        t.add(69f);
        t.add(3f);
        ArrayList<Float> test05 = new ArrayList(Arrays.asList(t));
        byte [] gf = new byte[]{3,1,2};
        ArrayList<Byte> k = new ArrayList<>();
        k.add((byte)266);
        k.add((byte)264);
        k.add((byte)265);
        ArrayList<Byte> test04 = new ArrayList(Arrays.asList(k));
        char [] n = new char[]{'l','h','e'};
        ArrayList<Character> b = new ArrayList<>();
        b.add('a');
        b.add('g');
        b.add('f');
        ArrayList<Character> test03 = new ArrayList(Arrays.asList(b));
        boolean [] f =new boolean[]{true,false,true};
        ArrayList<Boolean> y = new ArrayList<>();
        y.add(true);
        y.add(false);
        y.add(true);
        ArrayList<Boolean> test02 = new ArrayList(Arrays.asList(f));
        double [] w =new double[]{356,45,45};
        ArrayList<Double> i = new ArrayList<>();
        i.add(25d);
        i.add(8d);
        i.add(9d);
        ArrayList<Double> test01 = new ArrayList(Arrays.asList(w));

    }
}
