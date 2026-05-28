package Adaaulas.Adaaula;

public class Escolha2 {
    void main(){
        //Variável
        String cidade = "São paulo";

        //Switch Expressions
        String mesagem = switch(cidade){
            case "São Paulo" -> "Maior cidade do pais";
            case "Rio de Janeiro " -> "Cidade de belas praias";
            default -> "Cidade não encontrada";
        };
        System.out.println(mesagem);
    }
}
