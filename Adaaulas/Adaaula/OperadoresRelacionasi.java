package Adaaulas.Adaaula;

public class OperadoresRelacionasi {
    void main(){
        int num1 = 8;
        int num2 = 87;
        int num3 = 10;

        //Operadores Relacionais
        System.out.println(num1 > num3);//Maior
        System.out.println(num1 < num2);//Menor
        System.out.println(num2 >= num3);//Maior ou Igual
        System.out.println(num1 <= num3);//Menor ou Igual
        System.out.println(num2 == num1);//Igual
        System.out.println(num3 != num2);//Diferente
        

        //Operadores Logicos
        System.out.println(num1 < num2 && num3 != num2);
    }
}
