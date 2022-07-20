package udemyGeral.EstruturasDeControleERepeticao;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        int validas = 0;
        double soma = 0;
        do{
            System.out.println("Digite uma nota para ser somada e calculada a média: ");
            nota = entrada.nextDouble();
            if(nota <= 10 && nota >= 0){
                soma += nota;
                validas++;
            } else if (nota != -1) {
                System.out.println("Nota digitada inválida, digite uma nota entre 0 e 10.");
            }
        }while(nota != -1);
        System.out.printf("A soma das notas digitadas foi %.2f e a média foi %.2f", soma, soma/validas);
    }
}
