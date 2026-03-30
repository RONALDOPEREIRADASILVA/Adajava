package Adaaulas.Adaaula;
import javax.swing.JOptionPane; 
import java.time.Year; // Biblioteca para pegar o ano atual automaticamente

public class aula4 {
    public static void main(String[]args){
        int anoAtual = Year.now().getValue();//peguei o ano atual do sistema (para a conta ser real)

        String entrada = JOptionPane.showInputDialog("Em que ano você nasceu?");//abri a janela para o usuário digitar 

        int anoNascimento = Integer.parseInt(entrada);//converte o texto da janela em número inteiro

        int idade = anoAtual - anoNascimento;//Logica da conta 

        JOptionPane.showMessageDialog( null , "Você tem (ou vai fazer) " + idade + "anos" + anoAtual + "!");//Exibindo o resultado final na janelinha

        System.out.println("Cálculo realizado:" + anoAtual + "-" + anoNascimento + "=" + idade);//mostrando no terminal também
    }

}
/*
Aproveitando também pra treinar o Inglês:
    Traduzindo as palavras:
    *import = importar:É o comando que traz ferramentas de fora para dentro do seu código. Como o Java é muito grande, ele não carrega tudo de uma vez para não ficar pesado.

    *package = Pacote:É como uma pasta organizada onde ficam seus arquivos de código.

    *public class = Classe pública:No Java, tudo é uma classe. Imagine que a Classe é o molde ou a receita, e o objeto é o bolo pronto.

    *static = Estático:Significa que esse método pertence à classe e não precisa "criar um objeto" novo para rodar. Ele já está pronto para o uso assim que o programa liga.

    *void = Vazio:Indica que a função executa uma tarefa, mas não devolve nenhum valor matemático ou texto para quem a chamou. Ela só "faz o que tem que fazer" e pronto.
    *main = Principal:É a porta de entrada. Todo programa Java procura essa palavra para saber por onde começar a rodar.

    *args = Argumentos/Parâmetro:São valores que você pode passar para o programa na hora em que ele liga pelo terminal.

    *String =Cadeia de Caracteres:É o nome técnico para texto. Pode ser uma letra, uma frase ou um parágrafo. Sempre vem entre aspas duplas " ".

    *int = Inteiro:Números inteiros, sem vírgula (ex: 10, 50, -5).

    *Integer.parseInt = Analisar Inteiro:É um método que "lê" um texto e tenta transformá-lo em um número inteiro. Se o texto for "20", ele vira o número 20.

    *showMessageDialog = Caixa de Diálogode Mensagem:É o comando para exibir uma informação na tela.

    *JOptionPane =É uma classe da biblioteca Swing usada para criar Painéis de Opção (as janelinhas).

    *showInputDialog = Caixa de Diálogode Entrada:É o comando para pedir uma informação ao usuário.

    *System.out.println = Imprimir Linha na Saída do Sistema :O comando clássico para escrever uma linha de texto no terminal.
*/