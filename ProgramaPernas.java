import java.util.Scanner;
//Estruturas Condicionais
public class ProgramaPernas {
    public static void main(String[]args){
        Scanner tec =new Scanner(System.in);
        System.out.print("Quantas Pernas");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é Uma");
        switch (perna) {
            case 1:
                tipo="Saci";
                break;
            case 2:
                tipo="Bipede";
                break;
            case 3:
                tipo="Tripé";
                break;
            case 4:
                tipo="Quadrúpede";
                break;
            case 5:
                tipo="Aranha";
                break;                
        
            default:
                tipo="Et";
                break;
        }
        System.out.println(tipo);
    }
}
