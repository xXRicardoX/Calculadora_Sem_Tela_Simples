package Calcular.operacoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calcular {

    public static void realizandoOperacoes()  {

        Operadores operadores = new Operadores();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int sair = 0;
        while (sair != 1) {

            System.out.print("Digite um valor: ");
            double valor_a = scanner.nextDouble();
            System.out.print("Digite um valor: ");
            double valor_b = scanner.nextDouble();

            System.out.println("""
                    Escolha uma opçao abaixo:
                    1 - Somar
                    2 - Subtrair
                    3 - Dividir
                    4 - Multiplicar
                    """);
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double soma = operadores.somaOperadores(valor_a, valor_b);
                    String formatSoma = df.format(soma);
                    System.out.println("O valor da sua divisão é: " + formatSoma + "\n");
                    break;
                case 2:
                    double sub = operadores.subtracaoOperadores(valor_a, valor_b);
                    String formatSubtracao = df.format(sub);
                    System.out.println("O valor da sua divisão é: " + formatSubtracao + "\n");
                    break;

                case 3:
                    double diviasao = operadores.divisaoOperadores(valor_a, valor_b);
                    String formatDivisao = df.format(diviasao);
                    System.out.println("O valor da sua divisão é: " + formatDivisao + "\n");
                    break;

                case 4:
                    double multi = operadores.multiplicacaoOperadores(valor_a, valor_b);
                    String formatMultiplicacao = df.format(multi);
                    System.out.println("O valor da sua divisão é: " + formatMultiplicacao + "\n");
                    break;

                default:
                    System.out.println("O valor invalido");
                    break;
            }

            System.out.println("Digite 1 para sair ou outro valor para continuar!!!!");
            sair = scanner.nextInt();

        }
    }
}
