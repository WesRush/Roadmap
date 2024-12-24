package Cem.Dias.RoadmapJava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] intArray = new int [3][];
        //criando arrays que irão referenciar outros com posições de vários tamanhos com vários tipos de inicializações
        intArray[0] = new int[2];
        intArray[1] = new int[]{1,2,3};
        intArray[2] = new int[]{1,2,3,4,5,6};

        int[][] intArray2 = {{1,2},{4,5,6},{7,8,9,10,11,12,13}};

        for(int[] arr: intArray){
            System.out.println("\n-----------");
            for(int num: arr){
                System.out.print(num);
            }
        }
    }
}
