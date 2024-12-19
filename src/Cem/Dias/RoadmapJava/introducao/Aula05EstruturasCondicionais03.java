package Cem.Dias.RoadmapJava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salário > 5000;
        //operador ternário
        // sempre associa um valor diretamente numa variável e tem a mesma função do if
        //sintaxe operador ternário : (condição) ? verdadeiro:falso;
            double salary = 6000;
            String donateAlert = "Eu vou doar 500 reais";
            String notDonateAlert = "ainda não tenho condições, mas vou ter";
            String Result = salary > 5000 ? donateAlert : notDonateAlert;
        //outra opção de usar: String result = salary> 5000 ? "Eu vou doar 500 reais" : "ainda não tenho condições, mas vou ter";

            //é possível fazer uma expressão válido com ternário dentro do SOUT, mas não é uma boa prática
        System.out.println(Result);


    }
}
