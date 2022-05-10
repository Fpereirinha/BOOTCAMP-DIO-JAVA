package exerciciosloops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o número para calcular a tabuada ?");
        int numero = scan.nextInt();
        for (int cont = 1; cont<=10; cont++){
            System.out.println(cont + " x " + numero + " = " + (cont*numero));

        }

    }
}
