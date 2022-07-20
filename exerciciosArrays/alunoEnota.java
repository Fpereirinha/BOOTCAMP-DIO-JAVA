package exerciciosArrays;

import java.util.Scanner;

public class alunoEnota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a quantidade de alunos ?");
        int qtdAlunos = entrada.nextInt();
        System.out.println("Quantas notas por aluno ?");
        int notas = entrada.nextInt();
        double soma = 0;
        int cont = 0;
        double[][] sala = new double[qtdAlunos][notas];
        for (int i = 0; i < qtdAlunos; i++) {
            for (int j = 0; j < notas; j++) {
                System.out.printf("Aluno %d nota %d: ", i+1,j+1);
                sala[i][j] = entrada.nextDouble();
                cont++;
                soma += sala[i][j];
            }
        }
        System.out.printf("A média da sala é %.2f", soma/cont);

    }
}
