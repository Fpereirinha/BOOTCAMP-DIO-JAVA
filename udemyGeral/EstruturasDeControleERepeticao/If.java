package udemyGeral.EstruturasDeControleERepeticao;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double media = input.nextDouble();
        if (media >= 6) System.out.println("Aprovado");
        else System.out.println("Reprovado");
        input.close();
    }
}
