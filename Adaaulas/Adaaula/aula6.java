package Adaaulas.Adaaula;
/* Operadores Lógicos e Relacionais.
Nesta aula foi sobre operadores lógicos e relacionais.
como pratica umas linhas de códigos abaixo.

*/

public class aula6 {
    public static void main(String[]args){
        int x, y ,z;
        x = 4;
        y = 7;
        z = 1;
        
        String formaDePagamento = "à vista";
        double valor = 200;

        boolean r ;
        r = (x< y && y ==z)?true:false;
        
        //Verificações
        System.out.println(r);

        System.out.println(formaDePagamento == "à vista" && valor == 200);
    }
}
