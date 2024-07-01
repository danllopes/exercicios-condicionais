import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
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
                short product;
                int quantity;
                double price;
                System.out.println("Exercicio 02\n" +
                                   "------------");

                System.out.println("CODIGO         ESPECIFICAÇÃO        PREÇO\n" +
                                   "-----------------------------------------\n" +
                                   "  01          Cachorro Quente      R$4.00\n" +
                                   "  02          X-Salada             R$4.50\n" +
                                   "  03          X-Bacon              R$5.00\n" +
                                   "  04          Torrada Simples      R$2.00\n" +
                                   "  05          Refrigerante         R$1.50\n" +
                                   "-----------------------------------------\n");

                System.out.print("Produto: ");
                product = sc.nextShort();

                if (product < 1 || product > 5) {
                    System.out.println("Produto indisponível");
                    break;
                }


                System.out.print("Quantidade: ");
                quantity = sc.nextInt();

                if(product == 1) {
                    price = quantity * 4;
                } else if(product == 2) {
                    price = quantity * 4.50;
                } else if (product == 3) {
                    price = quantity * 5;
                } else if(product == 4) {
                    price = quantity * 2;
                } else {
                    price = quantity * 1.50;
                }

                System.out.printf("\nValor da conta: R$ %.2f", price);

                break;

            case 3:
                double num;
                System.out.println("Exercicio 03\n" +
                                   "------------");

                System.out.print("\nNúmero a ser analisado: ");
                num = sc.nextDouble();

                if (num >= 0 && num <= 25) {
                    System.out.println("O seu número está no seguinte intervalo: 0 - 25");
                }  else if (num > 25 && num <= 50) {
                    System.out.println("O seu número está no seguinte intervalo: 25 - 50");
                } else if (num > 50 && num <= 75) {
                    System.out.println("O seu número está no seguinte intervalo: 50 - 75");
                } else if (num > 75 && num <= 100) {
                    System.out.println("O seu número está no seguinte intervalo: 75 - 100");
                } else {
                    System.out.println("Fora de intervalo");
                }
                break;

            case 4:

                double salary;
                double incomeTax;
                System.out.println("Exercicio 04\n" +
                                   "------------");

                System.out.print("\nInforme sua renda mensal: R$ ");
                salary = sc.nextDouble();

                if (salary <= 2000) {
                    System.out.println("\nValor do Imposto: Isento");
                } else {
                    double taxableAmount = salary - 2000;
                    if (salary >= 2000.01 && salary <= 3000) {
                        incomeTax = taxableAmount * 0.08;
                    } else if (salary >= 3000.01 && salary <= 4500) {
                        incomeTax = (taxableAmount - 1000) * 0.18 + 1000 * 0.08;
                    } else {
                        incomeTax = (taxableAmount - 2500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
                    }

                    System.out.printf("\nValor do Imposto: R$ %.2f", incomeTax);
                }
                break;

            default:
                System.out.println("Exercício não encontrado.");
        }

        sc.close();
    }
}