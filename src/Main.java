import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        short option;

        System.out.println("Para acessar os enunciados dos exercícios, " +
                "\nvá até a pasta 'documentação' e abra o arquivo PDF\n");

        System.out.println("OPÇÃO        EXERCÍCIO\n" +
                           "----------------------\n" +
                           "  1              01\n" +
                           "  2              02\n" +
                           "  3              03\n" +
                           "  4              04\n" +
                           "----------------------\n");

        System.out.print("Exercício Nº: ");
        option = sc.nextShort();

        for(int i = 0; i < 10; i++) {
            System.out.println();
        }

        switch (option) {
            case 1:
                int number;
                System.out.println("Exercicio 01\n" +
                                   "------------");
                System.out.print("Número INTEIRO a ser analisado: ");
                number = sc.nextInt();

                if(number%2 == 0) {
                    System.out.printf("\nO número %d é PAR", number);
                } else {
                    System.out.printf("\nO número %d é IMPAR", number);
                }
                break;

            case 2:
                System.out.println("Exercicio 02");
                break;

            case 3:
                System.out.println("Exercicio 03");
                break;

            case 4:
                System.out.println("Exercicio 04");
                break;

            default:
                System.out.println("Exercício não encontrado.");
        }

        sc.close();
    }
}