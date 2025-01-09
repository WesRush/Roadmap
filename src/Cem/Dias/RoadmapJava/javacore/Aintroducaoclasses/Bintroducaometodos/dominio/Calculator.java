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
    //metodo que é constituído de um tipo de variável precisa de um return
    public double twoNumDiv (double num1, double num2){
        if(num2==0){
            return 0;
        }
    return num1/num2;
    }
    //parametros tipo primitivo
    public void twoNumAlter (int num1, int num2){
        num1 =99;
        num2 = 33;
        System.out.println("Dentro do twoNumAlter");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
