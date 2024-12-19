package Cem.Dias.RoadmapJava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000
        //----------- Minha Solução -------------------
        //int count = 0;
        //while (count < 1000000) {
        //    count++;
        //  if (count % 2 == 0) {
        //      System.out.println(count);
        //a execução do meu código acima só funciona se for top to down, descomente essa parte e teste com debug

        //----------------------Solução DevDojo --------------------------------------
        // o for fica mais adequado nessa solução porque o for estruturalmente volta para o parâmetro definido
        for (int i = 0; i <= 10 ; i++) {
            if (i % 2 == 0) {
            System.out.println(i);}
        }
        }
    }




