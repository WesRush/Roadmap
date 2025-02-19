package roadmap.logica.facil;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para contar até ele: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n ; i++) {
            System.out.println(i);

        }
    }
}
