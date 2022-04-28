package tamkdesuostatne.tyzden42;

public class vetvenieKodu {

    public static void main(String [] args){
        dlzkamena("Stanislav palkovic");
        System.out.println("============len if ==========");
        lenif(true,"stano");
        ifElse(false,"stano");
        System.out.println("=================== if else ==================" );
        ifElse(true,"stano");
        ifElse(false,"stano");
    }

    public static void dlzkamena(String meno){
    if(meno.length() > 10){
            System.out.println("moje meno je vacsie ako 10 znakov");
        }
    else{
        System.out.println("moje meno je mensie ako 10 znakov");
        }


    }

    public static void lenif(boolean viaJavu, String meno){

        if(viaJavu){
            meno = meno + "vie Javu";
        }
        meno = meno + "vie Matematiku";

        System.out.println(meno);
    }

    public static void ifElse(boolean vieJavu, String meno){
        if(vieJavu){
            meno=meno + "vie javu";
        }else {
            meno = meno + "vie matematiku";
        }
        System.out.println(meno);
    }


}
