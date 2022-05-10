package exerciciosArrays;

import java.util.Random;

public class arrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++){
            for (int i1 = 0; i1 < matriz[i].length; i1++){
                matriz[i][i1] = random.nextInt(9);
            }

        }
        for (int[] linha: matriz){
            for (int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
