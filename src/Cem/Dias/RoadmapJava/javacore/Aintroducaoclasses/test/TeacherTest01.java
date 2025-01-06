package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.test;

import Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.dominio.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //para alterar as variáveis logicamente se declara novamente a variável do objeto acima...
        teacher.name = "Gustavo";
        teacher.age = 45;
        teacher.gender = 'M';
        System.out.println(teacher.name + " " + teacher.age+ " "+ teacher.gender);


    }
}
