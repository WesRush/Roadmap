package roadmap.logica.facil;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o multiplicando: ");
        int n1 = sc.nextInt();


        for (int i = 1; i < 11 ; i++) {
            int mult = n1*i;
            System.out.println(n1+ " x 2"+ i +" = "+ mult);


        }
    }
}
