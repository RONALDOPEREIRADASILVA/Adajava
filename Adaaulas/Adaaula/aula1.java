package Adaaulas.Adaaula;
/*Exercício
Criar uma variável "soma" começando em 0.Criar um for que vai de 1 até 5. Dentro do for ,somar o valor i na variável soma. 
*/
public class aula1 {
    public static void main(String[] args){
        int soma = 0;
        for(int i =1; i<= 5; i++){
            soma = soma + i ;
            System.out.println("voltar" + i + "| Soma parcial: " + soma);
        }

    }
}
