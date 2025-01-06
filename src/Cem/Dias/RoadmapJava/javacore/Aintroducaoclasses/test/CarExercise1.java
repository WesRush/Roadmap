package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.test;

import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.dominio.Car;

public class CarExercise1 {
    //classe duplicada para fazer teste de referência
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Fiat";
        car1.model = "Siena";
        car1.year = 2015;

        car2.name= "Audi";
        car2.model= "A4";
        car2.year = 2025;
        car1 = car2; // aqui que se define que o car1 também será car2
        //só é possível fazer esse tipo de referência quando o objeto é do mesmo tipo
        System.out.println("------------Data Base Car 1---------\n"+
                                 car1.name+ "\n"+
                                 car1.model+ "\n"+
                                 car1.year+ "\n"+
                          "------------Data Base Car 2---------\n"+
                                car2.name+ "\n"+
                                car2.model+ "\n"+
                                car2.year+ "\n");

    }
}
