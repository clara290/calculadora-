import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado = 0.0;

            switch (operacao) {
                case '+':
                    resultado = Calculadora.somar(numero1, numero2);
                    break;
                case '-':
                    resultado = Calculadora.subtrair(numero1, numero2);
                    break;
                case '*':
                    resultado = Calculadora.multiplicar(numero1, numero2);
                    break;
                case '/':
                    resultado = Calculadora.dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }

            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Operação concluída!");
            scanner.close();
        }
    }
}