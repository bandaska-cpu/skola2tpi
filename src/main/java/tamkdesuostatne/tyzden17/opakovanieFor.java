package tamkdesuostatne.tyzden17;

public class opakovanieFor {
    public static void main(String[] args) {
        obycajnyFor();
        nekonecny();
    }


    public static void obycajnyFor(){
        for (int i =10; i<20;i++){
            System.out.println("cyklus cislo" +i);
        }
    }
    public static void nekonecny(){
        for (int i =10; i<20;){
            System.out.println("haha");
        }
    }
}
