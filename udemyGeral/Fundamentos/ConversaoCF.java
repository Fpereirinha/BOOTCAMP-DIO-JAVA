package udemyGeral.Fundamentos;

import java.util.Scanner;

public class ConversaoCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vezes = 5/9.0;
        System.out.println("Digite o valor em F:");
        int fare = scan.nextInt() - 32;
        System.out.println("O resultado em C° é " + fare * vezes);

    }
}
