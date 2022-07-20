package udemyGeral.Fundamentos;

import java.util.Scanner;

public class DesafioOperação {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = entrada.nextDouble();
        System.out.println("Digite a operação a ser executada [ / * % - +]");
        String op = entrada.next();
        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 : resultado;
        resultado = "*".equals(op) ? n1 * n2 : resultado;
        resultado = "/".equals(op) ? n1 / n2 : resultado;
        resultado = "%".equals(op) ? n1 % n2 : resultado;
        System.out.printf("O resultado de %.2f %s %.2f é %.2f", n1, op, n2, resultado);
        entrada.close();
    }
}
