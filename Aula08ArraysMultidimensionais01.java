

/**
 * ============================================================================
 * AULA: Arrays Multidimensionais (Matrizes)
 * ============================================================================
 * 
 * CONCEITO CHAVE:
 * Um Array Multidimensional em Java é, em sua essência, um "array de arrays".
 * Enquanto um array simples representa uma lista unidimensional (vetor),
 * uma matriz de duas dimensões representa uma estrutura de dados tabular
 * organizada em linhas e colunas.
 * 
 * ESTRUTURA E SINTAXE:
 * - Declaração: tipo[][] nome = new tipo[linhas][colunas];
 * - O primeiro par de colchetes [] acessa a LINHA.
 * - O segundo par de colchetes [] acessa a COLUNA dentro daquela linha.
 * 
 * NAVEGAÇÃO E ITERAÇÃO:
 * Para percorrer uma matriz bidimensional, utiliza-se a técnica de laços
 * aninhados (for dentro de for):
 * 1. O loop externo (i) controla o índice da LINHA atual.
 * 2. O loop interno (j) percorre todas as COLUNAS daquela linha especifica.
 * 
 * VALORES PADRÃO E INICIALIZAÇÃO:
 * Quando um array numérico (int) é instanciado sem atribuição direta,
 * suas posições não preenchidas são inicializadas automaticamente com o valor 0.
 * 
 * ============================================================================
 */



public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1. Declaração e Inicialização
        int[][]dias = new  int[3][3];

        // 2. Atribuição de valores (Linha 0)
        dias[0][0]=31;
        dias[0][1]=28;
        dias[0][2]=29;
        // 2. Atribuição de valores (Linha 1)
        dias [1][0]=31;
        dias [1][1]= 28;
        dias[1][2]=31;

        // Note: A linha 2 (dias[2]) não foi preenchida manualmente, 
        // então todos os seus valores permanecem com o padrão do tipo int, que é 0.
        
        // 3. Iteração / Percorrendo a Matriz
        for(int i = 0; i < dias.length; i++){
            for(int j =0;j <dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
    }
}
