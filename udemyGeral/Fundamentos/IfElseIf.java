package udemyGeral.Fundamentos;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero = input.nextDouble();
        if (numero >= 2 && numero <= 5) {
            System.out.println("Nota C");
        } else if (numero > 5 && numero <= 7) {
            System.out.println("Nota B");
        } else if (numero > 7 && numero <= 9.9) {
            System.out.println("Nota A");
        } else if (numero == 10) {
            System.out.println("Nota A++");
        }
        input.close();
    }
}
