package Cem.Dias.RoadmapJava.introducao;

public class Aula07Array03 {
    public static void main(String[] args) {
        //formas de inicialização do array
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
       }
        //foreach
        //é nada mais que um for reduzido, pois percorre o array sem precisar do indexador
        //a variável do parâmetro deve ser a mesma do array
        for(int num: numbers3){
            System.out.println(num);
        }
    }
}
