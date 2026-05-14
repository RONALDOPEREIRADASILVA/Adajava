package Adaaulas.Adaaula;
/*
Execício
Criar uma variavel salario e imprima seu imposto?
imposto:
salario < 1000 =5%
salario >=100 && salario < 2000 =10%
salario >=2000 && salario < 4000 = 15%
salario >5000 = 20%

*/

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu salario pra ver o imposto");
        double salario = s.nextInt();
        double imposto ;
        if (salario < 1000) {
            imposto = salario * 0.05;
            System.out.println("O imposto para o salario:" + salario + " É  de 5% fica R$:" + imposto);
            return;
        }else if (salario>=1000 &&  salario < 2000 ) {
            imposto = salario * 0.1;
            System.out.println("O imposto para o salario:" + salario + " É  de 10% fica R$:" + imposto);
            return;
        } else if (salario >=2000 && salario < 4000) {
            imposto = salario * 0.15;
             System.out.println("O imposto para o salario:" + salario + " É  de 15% fica R$:" + imposto);
            return;

        }else if (salario > 5000) {
            imposto = salario * 0.2;
            System.out.println("O imposto para o salario:" + salario + " É  de 20% R$:"+ imposto);
            return;

        }

        

    } 
}
