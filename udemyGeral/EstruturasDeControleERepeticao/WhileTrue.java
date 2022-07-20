package udemyGeral.EstruturasDeControleERepeticao;

import java.util.Scanner;

public class WhileTrue {
    public static void main(String[] args) {
        String x;
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("Digite uma palavra, ou sair para sair.");
            x = entrada.next();
            if (x.equalsIgnoreCase("sair")) break;
            System.out.printf("A palavra digitada foi %s\n",x);
        }
        entrada.close();
        System.out.println("Sistema encerrado.");
    }
}
