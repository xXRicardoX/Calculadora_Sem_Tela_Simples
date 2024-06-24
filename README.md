# Calculadora Simples em Java

Este projeto é uma calculadora simples desenvolvida em Java que permite realizar operações básicas como adição, subtração, multiplicação e divisão. A interface é baseada em texto e interage com o usuário através do terminal.

## Descrição

A calculadora permite ao usuário inserir dois valores e escolher uma operação matemática entre as opções disponíveis. Em seguida, o resultado é exibido formatado com duas casas decimais. O programa continua a executar até que o usuário escolha sair.

## Funcionalidades

- **Adição**: Soma de dois valores.
- **Subtração**: Subtração de dois valores.
- **Multiplicação**: Multiplicação de dois valores.
- **Divisão**: Divisão de dois valores.

## Pré-requisitos

- **Java Development Kit (JDK)** versão 8 ou superior
- **IDE** ou Editor de texto para editar o código (recomendado IntelliJ, Eclipse ou VSCode)
- **Terminal** ou Prompt de Comando

## Como Executar

1. **Clone o repositório ou baixe os arquivos**

   ```bash
   git clone https://github.com/seu-usuario/calculadora-simples.git
   cd calculadora-simples
   ```

2. **Compile os arquivos Java**

   Abra o terminal na pasta onde os arquivos foram salvos e execute o comando:

   ```bash
   javac -d . Calcular/Main.java Calcular/operacoes/Calcular.java Calcular/operacoes/Operadores.java
   ```

3. **Execute o programa**

   Após a compilação, execute o programa com o comando:

   ```bash
   java Calcular.Main
   ```

## Estrutura do Código

### Classe `Main`

Esta é a classe principal que inicializa a aplicação e chama o método `realizandoOperacoes` da classe `Calcular`.

```java
package Calcular;

import Calcular.operacoes.Calcular;

public class Main {

    public static void main(String[] args) {
        Calcular.realizandoOperacoes();
    }
}
```

### Classe `Calcular`

Esta classe contém a lógica principal da calculadora. Ele solicita ao usuário que insira dois valores e escolha uma operação, depois executa a operação escolhida e exibe o resultado.

```java
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
                    Escolha uma opção abaixo:
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
                    System.out.println("O valor da sua soma é: " + formatSoma + "\n");
                    break;
                case 2:
                    double sub = operadores.subtracaoOperadores(valor_a, valor_b);
                    String formatSubtracao = df.format(sub);
                    System.out.println("O valor da sua subtração é: " + formatSubtracao + "\n");
                    break;
                case 3:
                    double divisao = operadores.divisaoOperadores(valor_a, valor_b);
                    String formatDivisao = df.format(divisao);
                    System.out.println("O valor da sua divisão é: " + formatDivisao + "\n");
                    break;
                case 4:
                    double multi = operadores.multiplicacaoOperadores(valor_a, valor_b);
                    String formatMultiplicacao = df.format(multi);
                    System.out.println("O valor da sua multiplicação é: " + formatMultiplicacao + "\n");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println("Digite 1 para sair ou outro valor para continuar!!!!");
            sair = scanner.nextInt();
        }
    }
}
```

### Classe `Operadores`

Esta classe contém os métodos para realizar as operações matemáticas básicas: soma, subtração, divisão e multiplicação.

```java
package Calcular.operacoes;

public class Operadores {

    public double somaOperadores(double valor_a, double valor_b) {
        return (valor_a + valor_b);
    }

    public double subtracaoOperadores(double valor_a, double valor_b) {
        return (valor_a - valor_b);
    }

    public double divisaoOperadores(double valor_a, double valor_b) {
        return (valor_a / valor_b);
    }

    public double multiplicacaoOperadores(double valor_a, double valor_b) {
        return (valor_a * valor_b);
    }
}
```

## Exemplos de Uso

Após executar o programa, você verá uma série de prompts solicitando que você insira valores e selecione uma operação. Abaixo está um exemplo de execução:

```plaintext
Digite um valor: 10
Digite um valor: 5
Escolha uma opção abaixo:
1 - Somar
2 - Subtrair
3 - Dividir
4 - Multiplicar
2
O valor da sua subtração é: 5.00

Digite 1 para sair ou outro valor para continuar!!!!
0
```

Neste exemplo, o usuário optou por subtrair 5 de 10, e o resultado foi 5.00.
