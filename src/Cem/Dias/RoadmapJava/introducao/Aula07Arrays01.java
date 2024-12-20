package Cem.Dias.RoadmapJava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //uma variável que faz referência a mais de 1 valor
        //por ser uma variável de tipo referencia, o array pode ser referenciado como nulo
        //arays são considerados objetos pela memória
        int[] ages = new int[3];
        ages[0] = 21;
        ages[1] = 15;
        ages[2] = 11;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}
