import java.util.Scanner;

public class ProgramaImpaPar {
    
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        int num =teclado.nextInt();
        if (num % 2 ==0) {
            System.out.println("O número: " + num + " é Par" );
        }else{
            System.out.println("O número: " + num + " é Ímpar");
        }
    }
}
