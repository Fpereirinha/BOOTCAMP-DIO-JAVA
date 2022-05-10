package exerciciosArrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas letras quer digitar ?");
        int qtd = scan.nextInt();
        int qtdc = 0, qtdv = 0;
        String[] letras = new String[qtd];
        String[] vogais = new String[qtd];
        int cont = 0;
        do{
            System.out.println("Digite a " + (cont+1) + "° letra:");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a")
                | letra.equalsIgnoreCase("e")
                | letra.equalsIgnoreCase("i")
                | letra.equalsIgnoreCase("o")
                | letra.equalsIgnoreCase("u"))){
                letras[cont] = letra;
                qtdc++;
            } else {
                vogais[cont] = letra;
                qtdv++;
            }
            cont++;
        } while (cont < qtd);
        System.out.println("Quantidade de consoantes digitadas: " + qtdc);
        System.out.print("Foram elas: ");
        for (String count : letras){
            if (count != null) System.out.print(count + " ");
        }
        System.out.println("\nQuantidade de Vogais digitadas: " + qtdv);
        System.out.print("Foram elas: ");
        for (String vogal : vogais){
            if (vogal != null){
                System.out.print(vogal + " ");
            }
        }


    }
}
