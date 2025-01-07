package Cem.Dias.RoadmapJava.introducao;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
    //int,double,float,char,byte,short,long,boolean
        //variáveis do tipo primitivo se escrevem com a letra inicial minúscula
        //diferença das variáveis = o tamanho da informação que é guardada
        //int =  4 bytes
        //long = 8 bytes
        //double = 8 bytes
        //float = 4 bytes
        //byte = 1 byte
        //short = 2 bytes
        // bpoolean = 1 byte
        //char =  2 byte

        // casting força um valor mesmo que excedente do seu tamanho numa variável, mas não é uma boa prática, exemplo abaixo:
        int age =  (int) 10000000000L;
        // o resultado não fica exato pois a quantidade de bytes se excede, mas uma variável com casting de mesmo tamanho o resultado é o mesmo. ex.:

        float ageExample = (float) 2500.0D;
        //--------------------------------------------------------------------------------------
        long bigNumber = 100000000L;
        //Para especificar melhor pode-se colocar
        // uma letra L no final do número para o compilador entender que se trata de uma variável long
        double salaryDouble = 2000.D;
        // se quiser ser mais preciso
        // pode colocar a letra d para especificar ao compilador que a variável é double
        float salaryFloat = 2500.0F;
        // se colocar decimais em um float
        // é necessário colocar a letra f para o compilador entenda que se trata de um float
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 'M';

        //string não é um tipo primitivo, na verdade, é uma classe. por isso se escreve com o letra inicial maiúscula
        //usa-se somente aspas duplas

        String nome = "weslley";

        System.out.println("A idade é " + age + " anos");
        System.out.println(falso);
        System.out.println("char "+ character);
        System.out.println("bytes excedentes: "+ age);
        System.out.println("bytes compatíveis: "+ ageExample);

        System.out.println("Meu nome é " + nome);
    }
}
