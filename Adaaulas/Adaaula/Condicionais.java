package Adaaulas.Adaaula;

public class Condicionais {
    void main(){
        //Variavel
        double nota = 3;

        //Condicional
        if ((nota > 7)) {
            System.out.println("Aluno Aprovado");
            
        }else if (nota ==6 || nota ==4) {
            System.out.println("O aluno esta de Recomperação");
            
        } else if (nota <= 3) {
            
            System.out.println("Aluno Reprovado");
        }
    }
}
