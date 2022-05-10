package exerciciosloops;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial de: ");
        int fatorial = scan.nextInt();
        int mult = 1;
        System.out.print(fatorial + "! = ");
        for(int i = fatorial; i >= 1; i--){
            if (i > 1){

                System.out.print(i + " x ");
            }else System.out.print(i + "");
            mult *= i;
        }
        System.out.println(" = " + mult);
    }
}
