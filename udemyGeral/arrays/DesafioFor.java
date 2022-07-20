package udemyGeral.arrays;

import java.util.Scanner;

public class DesafioFor   {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        System.out.println("Quantas notas deseja adicionar ?");
        int d1 = entrada.nextInt();
        int[] lista = new int[d1];
        for (int i = 0; i < d1; i++) {
            System.out.printf("digite o %d item", i+1);
            lista[i] = entrada.nextInt();
        }
        for (int numero:
             lista) {
            soma += numero;
        }
        System.out.printf("A soma dos números é %d", soma);
    }
}
