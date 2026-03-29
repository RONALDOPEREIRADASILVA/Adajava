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
