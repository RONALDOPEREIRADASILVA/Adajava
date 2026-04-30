public class EstruturaRepeticao {
    public static void main(String[]args){
        int cc =0;//contador iniciando em 0
        while (cc<25) {
            cc++;
           if (cc ==3 || cc ==5) {
           continue;//O comando continue pula o número 3 e 5 ,especificado no comando e volta pro proximo loop
           }
          System.out.println("cambalhota " + cc);  
          if (cc ==7) {
            System.out.println("A " + cc + " cambalhota é a ultima");
            break;// interonpe a repetição 
          }
        }
    }
}

/*
A estrutura de repetição while:
Deve ser usada quando não sabemos exatamente quantas vezes o código 
vai rodar(ex:até o usuário digitar "Sair" )
*/