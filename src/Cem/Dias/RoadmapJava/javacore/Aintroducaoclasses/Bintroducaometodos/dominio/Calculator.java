package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio;

public class Calculator {
    //retorno = pode ser vazio mesmo contendo informação
    //exemplo.: void
    //saída = uma mensagem oou qualquer tipo de operação visível
    public void twoNumSum (){
        System.out.println(10+10);

    }
    public void twoNumSub (){
        System.out.println(10 - 5);

    }
    //o metodo ele funciona como um contrato
    // se há apenas 2 numeros aqui, na classe calculatorteste02 spo aceitará 2 numeros com a característica da variável
    public void twoNumMult(int num1, int num2){
        System.out.println(num1 * num2);
    }
}
