package Cem.Dias.RoadmapJava.introducao;

public class Aula08ArraysMultidimensionais01 {
    //arrays multidimensaionais são arrays de arrays
    //exemplo, um ano poderia ser abstraído como um arrays multidimensionais:
    //meses - 1,2,3,4,5 ... 12
    //ultimo dia de cada mes 31,28,31,30...
    public static void main(String[] args) {
        int[][] days = new int [3][3];//o arrays base fará referencia a outro array, apenas os arrays que são referenciados terão o tipo da variável declarada

        //na prática o arrays multidimensional pode ser visto da forma abaixo:

        days[0][0] = 31;
        days[0][1] = 28;            //posição referencial 0
        days[0][2] = 31;

        days[1][0] = 31;
        days[1][1] = 28;            // posição referencial 1
        days[1][2] = 31;

        //o array referencial quando colocado para imprimir seu conteúdo ele resultará no endereço de memória

        //neste laço de repetição riá verificar cada arrays referencial e imprimirá seus resultados de forma sucessiva
        for (int i = 0; i < days.length ; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.print(days[i][j]);
            }
            }
        //for each com arrays multidimensionais
        System.out.println("\n---------------------------------");
        for(int[] arr : days){
            for(int num : arr){
                System.out.print(num);
        }
        }

    }


}
