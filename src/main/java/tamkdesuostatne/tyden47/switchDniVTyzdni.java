package tamkdesuostatne.tyden47;

public class switchDniVTyzdni {
    public static void main(String[] args) {
        System.out.println("den v tyzdni je "+dniVtyzdni(4));
        dniVtyzdni2(2);
    }
    static String dniVtyzdni(int x){
      switch (x){
          case 1:
            return "pondelok";
          case 2:
            return "utorok";
          case 3:
            return "streda";
          case 4:
            return "stvrtok";
          case 5:
            return "patek";
          case 6:
            return "sobota";
          case 7:
            return "nedela";
          default:
            return "neplatny den";
        }

    }
    static void  dniVtyzdni2(int x){
        String denVtyzdni ="";
        switch (x){
            case 1:
                 denVtyzdni= "pondelok";
                 break;
            case 2:
                denVtyzdni= "utorok";
                break;
            case 3:
                 denVtyzdni= "streda";
                 break;
            case 4:
                denVtyzdni= "stvrtok";
                break;
            case 5:
              denVtyzdni=   "patek";
              break;
            case 6:
               denVtyzdni= "sobota";
               break;
            case 7:
               denVtyzdni= "nedela";
               break;
            default:
                denVtyzdni= "neplatny den";
                break;
        }
            System.out.println(denVtyzdni);
    }
}

