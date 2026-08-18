package Adaaulas.Adaaula;

import java.util.Scanner;
/*
Execício:
Criar um swtch , que dado um valor de 1 a 7 printe um dia da semana de segunda à domingo.Sendo que 1 é domingo, 2 segunda ......

*/

public class Ex02 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 7");
        byte dia = d.nextByte();
        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 : 
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sesta");
                break;
            case 7:
                System.out.println("Sabado");
                break; 
            default:
                System.out.println("Opção inválida"); 
               break;                            
        }
    }
}
