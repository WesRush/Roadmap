package Cem.Dias.RoadmapJava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //como utilizar o break para sair de uma estrutura de repetição
    //imprima os primeiro 25 numeros de um dado valor, por exemplo, 50
    public static void main(String[] args) {

        int maxValue = 50;
        for (int i = 0; i <= maxValue ; i++) {
            if(i > 25){
                break; //o break ele deve estar dentro de um switch ou loop para funcionar
                          //não é possível utiliza-lo no if, se estiver fora das repetições que citei
            }
            System.out.println(i);

        }
    }
}
