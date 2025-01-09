package Cem.Dias.RoadmapJava.introducao;

public class Aula06EstruturasDeRepeticao05 {
//mesma lógica do exercício passar, só que com o continue
    public static void main(String[] args) {
        double carPrice = 30000;
        for (int parcel = (int) carPrice; parcel >= 1; parcel--) {
            double parcelPrice = carPrice / parcel;
            if(parcelPrice < 1000){
                continue;
            }
                System.out.println("Parcela " + parcel + " R$ " + parcelPrice);


        }
    }}
