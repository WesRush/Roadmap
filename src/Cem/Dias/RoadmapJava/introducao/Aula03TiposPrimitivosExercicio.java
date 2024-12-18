package Cem.Dias.RoadmapJava.introducao;


/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Weslley";
        String address = "Rua dos lírios, 40 - Muribeca, Jaboatão dos Guararapes";
        double salary = 15000.00;
        String date = "18-05-2025";
        String report = "eu "+ name +", morando no endereço "+address +
                " confirmo que recebi o salário de "+ salary +", na data "+date;;

        System.out.println(report);

    }
}
