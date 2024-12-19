package Cem.Dias.RoadmapJava.introducao;
//switch - usam variáveis - char, int, byte, short, enum, String
//forma simplificada de condicional mais fácil leitura
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo
        byte day = 6;

        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
                case 2:
                    System.out.println("Segunda");
                    break;
                    case 3:
                        System.out.println("Terça");
                        break;
                        case 4:
                            System.out.println("Quarta");
                            break;
                            case 5:
                                System.out.println("Quinta");
                                break;
                                case 6:
                                    System.out.println("Sexta");
                                    break;
                                    case 7:
                                        System.out.println("Sabado");
                                        break;
                                        default: //expressão padrão para quando há algo fora dos parametros do código e pode ser usado em qualquer lugar do escopo do switch
                                            System.out.println("Erro");
                                            break;

        }
        //exemplo 2

            char gender = 'F';
        switch (gender) {
            case 'M':
                System.out.println("Masculino");
                break;
                case 'F':
                    System.out.println("Feminino");
                    break;
                    default:
                        System.out.println("Erro");
        }
    }
}
