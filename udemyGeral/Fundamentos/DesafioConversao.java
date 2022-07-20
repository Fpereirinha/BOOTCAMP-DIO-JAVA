package udemyGeral.Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os ultimos 3 salários que calcularemos a média !");
        System.out.println("Salario 1: ");
        String s1 = entrada.nextLine().replace(",", ".");
        System.out.println("Salario 2: ");
        String s2 = entrada.nextLine().replace(",", ".");
        System.out.println("Salario 3: ");
        String s3 = entrada.nextLine().replace(",", ".");
        double soma = Double.parseDouble(s1) + Double.parseDouble(s2) + Double.parseDouble(s3);
        double media = soma / 3;
        System.out.println("A soma dos ultimos 3 salários é: " + soma);
        System.out.println("A média dos ultimos 3 salários é: " + media);

    }
}
