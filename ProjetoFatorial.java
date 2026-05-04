import java.util.Scanner;

public class ProjetoFatorial {

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int fatoreal =1;
    int contador= n.nextInt();

    while (contador>=1) {
        fatoreal*= contador;
        contador--;
    }
    System.out.println("O fatoreal é : " +fatoreal);
  }

}