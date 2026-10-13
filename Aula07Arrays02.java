public class Aula07Arrays02 {
    public static void main(String[] args) {
        String []nomes = new  String[4];
        //byte, shart, int, long, float e double
        //char \u0000
        //boolean false
        //String null
        nomes[0]="Ronaldo";
        nomes[1]="Paulo";
        nomes[2]="Bia";
        nomes[3]="Mia";

        for(int i = 0; i < nomes.length; i++){

        System.out.println(nomes [i]);
        }
        
    }
}
