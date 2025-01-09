package Cem.Dias.RoadmapJava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
         //o resultado padrão é 0 para declaração de arrays do tipo byte, short, int, long, float e double
        // para o tipo char é um unicode '\u0000'
        //boolean é false
        // e para reference ex.: String o padrão é null
        String[] names = new String[3];
        //o array não muda dinamicamente, para fazer alteração na entrada de dados é necessário mudar manualmente
        names[0] = "Pedro";
        names[1] = "Maria";
        names[2] = "João";
        for (int i = 0; i < names.length; i++) { //toda variável tipo reference, como arrays, tem propriedades ex.: o .length
            System.out.println(names[i]);
        }

    }
}
