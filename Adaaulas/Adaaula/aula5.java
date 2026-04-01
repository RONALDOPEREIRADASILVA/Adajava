package Adaaulas.Adaaula;

import javax.swing.JOptionPane;

public class aula5 {
    public static void main(String[]args){
        String  entradaA=JOptionPane.showInputDialog("Digite um número");
        String  entradaB =JOptionPane.showInputDialog("Digite um número");
        int n = Integer.parseInt(entradaA);
        int d =Integer.parseInt(entradaB);

        float divs= n / d;
        float rest = n % d;

        JOptionPane.showMessageDialog( null , "O resultado da divisão é " + divs);
        JOptionPane.showMessageDialog(null,"O resto da divisão é:" + rest);
    }
}
