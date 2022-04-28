package tamkdesuostatne.tyzden17;

public class OpakovanieIfElse {

    public static void main(String[] args) {
        NaseIfElse(10);
    }

    static void NaseIfElse(int hodina){

        if(hodina<12){
            System.out.println("dopoludnia");
        }
        else if (hodina<10){
            System.out.println("popoludinie");
        }
        else {
            System.out.println("noc");
        }
    }
}
