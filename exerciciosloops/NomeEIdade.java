package exerciciosloops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Qual o nome ?");
            String nome = scan.next();
            System.out.println("Qual a idade ?");
            int idade = scan.nextInt();
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Quer continuar? [0] parar [1] continuar");
            int resp = scan.nextInt();
            if (resp == 0) {
                System.out.println("programa finalizado !");
                break;
            }
        }


    }
}
