package exerciciosloops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a quantidade de números que deseja calcular ?");
        int qtd = scan.nextInt();
        int cont = 0, par = 0, impar = 0;
        do {
            System.out.println("Digite o " + (cont+1) + " numero");
            int numero = scan.nextInt();
            if (numero % 2 == 0) par++;
            else impar++;
            System.out.println("Pares até o momento: " +par);
            System.out.println("Impares até o momento: " +impar);
            cont++;
        }while(cont < qtd);
        System.out.println("Programa finalizado.");
        System.out.println("Total de pares: " +par);
        System.out.println("Total de impares: " +impar);

    }
}
