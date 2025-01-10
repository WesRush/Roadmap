package Cem.Dias.RoadmapJava.javacore.Aintroducaoclasses.Bintroducaometodos.dominio;

public class PrintStudent {
        public void print (Student student){
            student.name = "Fulano";//altera toda a referencia
            System.out.println("-------------------------");
            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.gender);

    }
}
