package exerciciosArrays;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a quantidade de números que quer gerar ?");
        int qtd = scan.nextInt();
        int[] numeros = new int[qtd];
        for(int i = 0; (i < numeros.length) | (i < qtd); i++){    // | usado apenas para aprendizado.
            numeros[i] = random.nextInt(100);
        }
        for(int obj : numeros){
            System.out.println("Na posição " + (contador+1) + "° temos " + obj + " e seu sucessor é " + (obj+1));
            contador++;
        }
    }
}
