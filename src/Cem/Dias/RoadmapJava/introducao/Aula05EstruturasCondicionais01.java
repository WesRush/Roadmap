package Cem.Dias.RoadmapJava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        System.out.println("Estruturas condicionais");
        //exemplo de autorização para compra de bebida alcoólica
        /* forma comum:
        int age = 20;
        if(age >=18){
          System.out.println("Autorizado a comprar bebida alcoólica");
        }
        System.out.println("fora do if");
         */
        //outra forma
        int age = 10;
        boolean isAllowedToBuy = age >= 18;
        //necessariamente o resultado deve ser booleano
        if (isAllowedToBuy)//o if só executa se a expressão dentro do parâmetro for verdadeira
        {
            System.out.println("Autorizado a comprar bebida alcoólica");
        }else {//o else ele pode ser ignorado caso a afirmação seja verdadeira
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
        //o if abaixo ele é independente e o código é executado mesmo após o bloco de código acima
        if (!isAllowedToBuy)// operador not (!) que inverte a condição que era falsa para ser executada| lê-se: se não é autorizado...
        {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
    }
}
