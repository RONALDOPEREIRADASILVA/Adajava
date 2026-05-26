package Adaaulas.Adaaula;

import java.util.Scanner;

public class aula7 {
    //Criar um objeto da class
    
      public static void main(String[] args) {
        //Criar um objeto da classe Scanner
        Scanner obj = new Scanner(System.in);
        
        //Obter nome
        System.out.println("Qual é o seu nome");
        String nome = obj.nextLine();

        //Obter idade
        System.out.println("Qual é a sua idade");
        int idade = obj.nextInt();

        //Finalizar interação
        obj.close();
        
        //Concatenação
        System.out.println("Olar " + nome + " Voçê tem " + idade + "anos." );
      }
}
