package udemyGeral.EstruturasDeControleERepeticao;


import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int soma = 0;
        int c = 1;
        int qtt;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos números deseja somar ?");
        qtt = entrada.nextInt();
        do {
            System.out.printf("Digite o %d° número a ser somado: ",c);
            int numero = entrada.nextInt();
            soma += numero;
            c++;
        } while (c <= qtt);
        System.out.printf("A soma dos números foi %d",soma);
    }
}
