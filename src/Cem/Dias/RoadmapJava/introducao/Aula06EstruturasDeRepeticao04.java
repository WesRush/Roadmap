package Cem.Dias.RoadmapJava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado o valor de um carro, descubra em quantas vezes ele deve ser parcelado
    //condição valor da parcela >= 1000
    //OBS: dessa vez não consegui fazer o exercício sem filar, me compliquei na lógica do for
    public static void main(String[] args) {
        double carPrice = 25000;
        for (int parcel = 1; parcel <= carPrice; parcel++) {
            double parcelPrice = carPrice / parcel;
            if (parcelPrice < 1000) {
                break;
            }
            if (parcelPrice >= 1000) {
                System.out.println("Parcela " + parcel + " R$ " + parcelPrice);

            }
        }
    }}
