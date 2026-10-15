public class Aula07Arrays03 {
    public static void main(String[] args) {
        //formas de inicializar um Arry
       int[]numero = new int[3]; 
       int[] numero2={1,2,3,4,5}; 
       int[] numero3= new int[]{1,2,3,4,5};
       
       //Formas de imprimir com o for

       for(int i =0; i < numero2.length; i ++){
        System.out.println(numero2[i]);
       }

       for(int num : numero3){
        System.out.println(num);
       }
    }
}
