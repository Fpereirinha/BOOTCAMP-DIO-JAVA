package udemyGeral.EstruturasDeControleERepeticao;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var val = entrada.nextInt();
        switch (val) {
            case 10 -> System.out.println("A");
            case 9, 8, 7, 6 -> System.out.println("B");
            case 5, 4, 3, 2, 1, 0 -> System.out.println("C");
            default -> System.out.println("valor não encontrado.");
        }
    }
}
