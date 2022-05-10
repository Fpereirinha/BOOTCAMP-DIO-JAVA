package exerciciosArrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 5, 7, 9};
        for (int i = numeros.length -1 ; i >= 0 ; i--){  // inverso
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for (int cont = 0; cont < numeros.length; cont++){ // normal
            System.out.print(numeros[cont] + " ");
        }
        System.out.println();
        for (int numero : numeros) {    // simplificado
            System.out.print(numero + " ");
        }
    }
}
