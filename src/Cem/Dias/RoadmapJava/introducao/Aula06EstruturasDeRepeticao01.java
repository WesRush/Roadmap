package Cem.Dias.RoadmapJava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //estruturas de repetição: while, do while, for
        //As estruturas de repetição precisam de um final para que não virem um loop infinito
        //são blocos de códigos que fazem o compilador voltar para o escopo inicial até que se determine um fim
        //o parâmetro assim como o if deve ter um resulado booleano
        //fazer a aplicação contar até 10 ex.:
        int count = 0;
        while (count < 10) {
            System.out.println("do " + ++count);
        }
        //do-while, principal diferença para o while é que o do sempre vai executar pelo menos uma vez independente da condição booleana
        count = 0;
        do {
            System.out.println("dentro do do-while " + ++count);

        }while (count < 10);
        //o for ele tem 3 partes:
        // 1. ele é indexado declarando a variável
        // 2. definir até onde o laço de repetição será executado
        // 3. como a variável vai alterar o status
        for (int i = 0; i < 10; i++) {
            System.out.println("for " + i);
        }
    }
}
