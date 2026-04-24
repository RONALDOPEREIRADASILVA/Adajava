import java.util.Scanner;
//Estruturas Condicionais
public class ProgramaVoto {
     public static void main(String[]args){
        Scanner v = new Scanner(System.in);
        System.out.println("Em que ano voçê nasceu?");
        int nascimento = v.nextInt();
        int i = 2026-nascimento;
        System.out.println("Sua idade é  "+ i + " Anos" );

        if (i<16) {
            System.out.println("Não vota");
        } else{
            if ((i>16 && i<18) || (i>70)) {
                
            
            System.out.println("Opcional");
          }else{
            System.out.println("Obrigatorio");
          }
        }
        
    }
}

