package exerciciosloops;

import java.util.Scanner;

public class maioremedia {
    public static void main(String[] args) {
        int contador = 0;
        float soma = 0;
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        while (contador < 5){
            System.out.println("Digite o " + (contador+1) + " numero");
            int numero = scan.nextInt();
            soma += numero;
            System.out.println("A soma até o momento é " +soma + ".");
            if (contador == 0){
                maior = numero;
            } else if (numero > maior) maior = numero;
            contador++;

        }
        System.out.println("O maior número é o " + maior + ". E a média dos números é " + soma/5);
    }
}
