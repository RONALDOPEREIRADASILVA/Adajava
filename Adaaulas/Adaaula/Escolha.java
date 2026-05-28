package Adaaulas.Adaaula;

public class Escolha {
    void main(){
        //Variável
        String cidade = "São Paulo";
        //Estrutura de Escolha
        switch (cidade) {
            case "São Paulo":
                System.out.println("A maior cidade do pais");
                break;
            case "Rio de Janeiro":
                System.out.println("Cidade de belas praia");
                break;    
        
            default:
                System.out.println("Cidade não encontrada");
                break;
        }
    }
}
