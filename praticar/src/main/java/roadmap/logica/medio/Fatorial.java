package roadmap.logica.medio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para calcular seu fatorial: ");
        int n = sc.nextInt();
        Long resultado = fatorial(n);
        System.out.println("O fatorial de "+n+ " é "+ resultado);
        }
    public static Long fatorial(int n){
      long resultado = 1;
        for (int i = 1; i <= n ; i++) {

            resultado*= i;

        }
        return resultado;
    }
}
