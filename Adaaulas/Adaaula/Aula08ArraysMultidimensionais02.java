package Adaaulas.Adaaula;
/**
 * Classe de estudo sobre Arrays Multidimensionais (Matrizes) em Java.
 * Demonstra declaração, alocação de memória, atribuição de valores,
 * comportamento padrão do Java para posições não inicializadas
 * e iteração usando For-Each encadeado.
 */
public class Aula08ArraysMultidimensionais02 {

    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 1. DECLARAÇÃO E INICIALIZAÇÃO
        // ------------------------------------------------------------------
        // Criamos uma matriz de inteiros com 3 linhas e 3 colunas (3x3).
        // A sintaxe int[][] indica 2 dimensões (linhas e colunas).
        // Neste momento, o Java aloca a estrutura na memória e preenche
        // automaticamente todas as 9 posições com o valor padrão do tipo int (0).
        int[][] dias = new int[3][3];


        // ------------------------------------------------------------------
        // 2. ATRIBUIÇÃO DE VALORES - LINHA 0 (Índice 0)
        // ------------------------------------------------------------------
        // Acessamos o elemento pela sintaxe: matriz[índiceLinha][índiceColuna]
        dias[0][0] = 31; // Linha 0, Coluna 0
        dias[0][1] = 28; // Linha 0, Coluna 1
        dias[0][2] = 29; // Linha 0, Coluna 2


        // ------------------------------------------------------------------
        // 3. ATRIBUIÇÃO DE VALORES - LINHA 1 (Índice 1)
        // ------------------------------------------------------------------
        dias[1][0] = 31; // Linha 1, Coluna 0
        dias[1][1] = 28; // Linha 1, Coluna 1
        dias[1][2] = 31; // Linha 1, Coluna 2


        // Nota: A Linha 2 (dias[2]) não recebeu valores explícitos.
        // Por isso, dias[2][0], dias[2][1] e dias[2][2] permanecerão com o valor 0.


        // ------------------------------------------------------------------
        // 4. IMPRESSÃO DO SEPARADOR
        // ------------------------------------------------------------------
        // As aspas duplas são obrigatórias para indicar que é uma String de texto,
        // evitando erros de sintaxe.
        System.out.println("--------------------------------");


        // ------------------------------------------------------------------
        // 5. LEITURA / ITERAÇÃO COM FOR-EACH ENCADEADO
        // ------------------------------------------------------------------
        // Um array multidimensional é, na verdade, um array de arrays.
        //
        // PRIMEIRO LAÇO: Extrai cada linha (que é um array unidimensional int[]).
        for (int[] arrBase : dias) {

            // SEGUNDO LAÇO: Passa por cada número contido no array da linha atual.
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}