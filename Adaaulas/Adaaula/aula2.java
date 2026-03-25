package Adaaulas.Adaaula;
/**
 * Desafio:
 * Se voçê estivesse criando um programa simples para somar o valor de dois produtos em uma loja (por exemplo , café R$ 4.50 e um pão de queijo de R$ 6.00), qual o tipo de dado numérico que vimos antes (int ou double) seria o mais adequado para essa soma ? e como voçê escreveria essa linha de código ? 
 * R: double, por conta dos centavos.
 */
public class aula2 {
    public static void main(String[] args){
        double produtoCafe = 4.50;
        double produtoQueijo =6.00;
        double resultado = produtoCafe + produtoQueijo ;
        System.out.print(resultado);
    }
    
}
