import java.util.Scanner;

/*
Estruturas Condicionais
*/

public class ProgramaIdade {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano voçê nasceu?");
        int nasc = t.nextInt();
        int i = 2015-nasc;
        System.out.println("Sua idade é  "+ i + "Anos" );

        if (i>18) {
            System.out.println("Maior de Idade!");
        } else{
            System.out.println("Menor de Idade!");
        }
        
    }
}
