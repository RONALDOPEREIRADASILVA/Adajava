/* 
 * RESUMO DA AULA - ARRAYS (VETORES):
 * 
 * 1. O que é: Estrutura de dados para guardar múltiplos valores do mesmo tipo.
 * 2. Inicialização: `new int[3]` reserva espaço em memória para exatamente 3 elementos.
 * 3. Índices: A contagem sempre começa no ZERO (0, 1, 2).
 * 4. Atribuição: Usamos array[índice] = valor para preencher as posições.
 * 
 * Obs: Escrever números com zero à esquerda (como '02') no Java pode ser interpretado 
 * como sistema Octal. Para o número dois simples, prefira usar apenas '2'.
 */

public class Aula07Arrays {
    public static void main(String[] args) {
        int[]idade = new  int[3];
        idade[0]= 28;
        idade[1]= 30;
        idade[2]=02;

        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);

    }
}
