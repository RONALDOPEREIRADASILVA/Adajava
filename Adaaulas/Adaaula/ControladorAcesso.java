package Adaaulas.Adaaula;

import java.util.Scanner;

/*Comando break and continue
*Dado um valor de um carro ,descubra em quantas vezes ele pode ser parcelado.
*porem as parcelas não podem passar de 1000

*/
public class ControladorAcesso {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Digite o valor do carro\n R$:");
        double valorTotal=p.nextDouble();
        for(int parcelas =1;parcelas <=valorTotal; parcelas++){
            
            double valorParcela= valorTotal / parcelas;
            if (valorParcela>=1000 && parcelas<= 10) {
            System.out.println("O valor "+ valorTotal + " A  parcela"+parcelas+" fica R$:"+ valorParcela
            );
            }
        }
    }
}
