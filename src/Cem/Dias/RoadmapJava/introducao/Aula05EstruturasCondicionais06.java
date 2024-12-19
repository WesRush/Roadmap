package Cem.Dias.RoadmapJava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //considerando 1 como domingo
        System.out.println("--------------- minha solução: ---------------------");
        byte day = 1;

        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("erro");
                break;
        }
        if (day == 7 || day == 1) {
            System.out.println("fim de semana");
        } else if (day > 7) {
            System.out.println("dia inválido!");

        } else if (day >= 2 || day <= 7) {
            System.out.println("dia útil");
        }
        System.out.println("--------------- Solução DevDojo: ---------------------");

        byte day2 = 7;
        switch (day2) {
            case 1:
            case 7:
                System.out.println("fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
                default:
                    System.out.println("erro");
                    break;

        }
    }
}
