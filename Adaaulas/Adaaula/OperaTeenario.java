package Adaaulas.Adaaula;

public class OperaTeenario {
    public static void main(String[] args){
        double salario = 600;
        String  mensagenDoar =" Eu vou dor pro Ronando";
        String mensagenNaoDoa = "mão vou doar por falta de dinheiro!";
        String resultado = salario > 5000 ? mensagenDoar : mensagenNaoDoa;

        System.out.println(resultado);
        if (resultado == mensagenDoar) {
            System.out.println("Eu Ronaldo te agradeço");
            
        }else {
            System.out.println( "De qualquer forma muito obrigado");
        }

    }
}
