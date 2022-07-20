package udemyGeral.EstruturasDeControleERepeticao;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        int segunda = 1;
        int terca = 2;
        int quarta = 3;
        int quinta = 4;
        int sexta = 5;
        int sabado = 6;
        int domingo = 7;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana escrito: ");
        String dia = entrada.next();
        entrada.close();
        System.out.print("O dia é o : ");
        if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(segunda);
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.println(terca);
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println(quarta);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println(quinta);
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println(sexta);
        } else if (dia.equalsIgnoreCase("sabado")) {
            System.out.println(sabado);
        } else if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(domingo);
        } else System.out.println("Dia digitado incorreto.");
    }
}
