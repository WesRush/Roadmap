package Cem.Dias.RoadmapJava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        System.out.println("operadores básicos : +, -, /,*");
        //operadores básicos : +, -, /,*
        //melhor prática para se obter resultado de uma soma é fazer a operação dentro de uma variável
        int number01 = 10;
        int number02 = 20;
        int SumResult = number01 + number02;
        //O sinal de adição no java é sobrecarregado, servindo para concatenar e fazer operação matemática. ex.:
        System.out.println("Valor "+ number01 + number02); //resultado será: valor 1020
        // no exemplo acima por ter uma string iniciando a saída de dados ele reconhece o + como concatenação
        //exemplo abaixo o java reconhece a soma e concatenação após a string
        System.out.println(number01 + number02 + " valor "+ number01+number02);//resultado será: 30 valor 1020
        //o sinal + do exemplo é reconhecido como soma
        System.out.println(number02 + number01);// resultado será 30
        // exemplo de resultado com a melhor forma de soma
        System.out.println(SumResult);
        //----------------------------------------------------------------------------------------------------------
        //variáveis int só resultam em resultados inteiros ex.:
        int numberInt = 10;
        int numberInt01 = 20;
        //é possível fazer casting para que se converta as variáveis, mas não é uma boa prática
        int divResultInt = numberInt / numberInt01;
        System.out.println(divResultInt);// resultará em 0, pois é um numero inteiro e as variáveis declaradas são do tipo int

        //-------------------------------------------------------------------------------------------------------------
        //variáveis double devem ter resultados declarados como double ex.:
        double numberDouble = 10;
        double numberDouble01 = 20;

        double divResultDouble = numberDouble / numberDouble01;
        System.out.println(divResultDouble);// resultado 0.5 corretamente pois a variável está double

        //---------------------------------------------------------------------------------------------------------
        //operador módulo: % Calcula o resto da divisão. Muito útil para definir se números são pares ou ímpares
        int rest = 21 % 7;
        System.out.println(rest);
        System.out.println("----------------------------"); //separador
        System.out.println("operadores lógicos iniciais: sempre retornam valores booleanos <, >, <=, >=, ==, !=");
        //operadores lógicos iniciais: sempre retornam valores booleanos <, >, <=, >=, ==, !=
        boolean isTenGreaterThanTwenty = 10 > 20; // false
        boolean isTenLessThanTwenty = 10 < 20; //true
        boolean isTenEqualToTwenty = 10 == 20; // false
        boolean isTenEqualTen = 10 ==10 ;// true
        boolean isTenDifferentTen = 10 != 10; // false
        //não se compara variáveis de tipos incompatíveis ex.: comparar string com int
        System.out.println("is ten greater than twenty? "+isTenGreaterThanTwenty);
        System.out.println("is ten less than twenty? "+isTenLessThanTwenty);
        System.out.println("is ten equals twenty? "+isTenEqualToTwenty);
        System.out.println("is ten equals ten? "+isTenEqualTen);
        System.out.println("is ten different than ten? "+isTenDifferentTen);
        //mesma lógica se segue para os demais operadores lógicos
        System.out.println("----------------------------"); //separador
        //-------------------------------------------------------------------------------------------------
        System.out.println("operadores and (&&), or (||) ");
        //operadores and (&&), or (||). Tem o not (!) também, mas será abordado com estruturas condicionais
        //baseado no exemplo do devdojo aula 17 - a holanda tem um sistema de assistência ao imigrante que define um auxilio para imigrante de diversas faixas etárias
        int age = 29;
        float salary = 3500F;
        //se umas das afirmações for falso e a outra verdadeira, então tudo é falso
        // mas se as duas afirmações forem iguais, tudo é verdadeiro
        boolean isWithinTheLawGreater30 = age >= 30 && salary >= 4612;

       boolean isWithinTheLawLess30 = age < 30 && salary >= 3381;
        System.out.println("is within the law greater 30? "+isWithinTheLawGreater30);
        System.out.println("is within the law less 30? "+isWithinTheLawLess30);

        double totalValueCurrentAccount = 200;
        double totalValueSavingsAccount = 10000;
        float playstationValue = 5000f;

        boolean isPlaystationBuyable = totalValueCurrentAccount > playstationValue || totalValueSavingsAccount > playstationValue;
        System.out.println("is playstation buyable? "+isPlaystationBuyable);
        System.out.println("----------------------------"); //separador
        System.out.println("operador de atribuição: =, +=, -=, *=, /=, %=");
        //operador de atribuição: =, +=, -=, *=, /=, %=

        //criados apenas para economizar código
        //ao invés de repetir a declaração da variável, com esse operadores é possível fazer esse tipo de lógica. ex.:
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2;//1800
        bonus %= 2; //0.0
        System.out.println(bonus);

        int counter = 0;
        counter += 1; //contador = contador +1;
        counter++; //abreviação máxima do código acima
        counter--; //possível diminuir
        System.out.println(counter);
        // há diferença em colocar a atribuição antes e depois da variável. ex.:
        int counter2 = 0;
        int counter3 = 0;
        System.out.println(counter2++);//resultado será 0, pois a atribuição está vindo após a impressão do resultado no terminal
        System.out.println(++counter3); //resultado será 1, pois a atruibuição está antes da impressão no terminal


    }
}
