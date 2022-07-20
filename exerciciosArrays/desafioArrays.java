package exerciciosArrays;

import java.util.Scanner;

public class desafioArrays {
    public static void main(String[] args) {
        double soma = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a quantidade de notas que deseja informar ?");
        int notas = entrada.nextInt();
        double[] notas1 = new double[notas];
        for (int i = 0; i < notas; i++) {
            System.out.printf("Digite a %d°nota: ", i+1);
            notas1[i] = entrada.nextDouble();
        }
        int contador = 1;
        for (double c:
             notas1) {
            soma += c;
            System.out.printf("%d° nota digitada foi: %.2f \n",contador, c);
            contador++;
        }
        System.out.printf("A média de %d notas é %.2f", notas, soma/notas);


    }
}
