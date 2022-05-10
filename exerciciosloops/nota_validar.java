package exerciciosloops;

import java.util.Scanner;

public class nota_validar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a nota:");
        int nota = scan.nextInt();
        while (nota < 0 | nota > 10){
            System.out.println("digite uma nota valida!!!");
            System.out.println("digite a nota:");
            nota = scan.nextInt();
        }
        System.out.println("A nota digitada foi validada e foi a nota " + nota);
    }
}
