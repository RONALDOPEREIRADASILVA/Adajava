package Adaaulas.Adaaula;

import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno :");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno :");
        float nota = teclado.nextFloat();
        System.out.printf("nota do %s é %.1f \n" , nome ,nota);

        teclado.close();

    }
}
