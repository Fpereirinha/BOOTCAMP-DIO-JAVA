package udemyGeral.arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notas = new double[3];
        notas[1] = 1;
        notas[2] = 30;
        notas[0] = 22;
        int total = 0;
        for (double nota : notas) {
            System.out.print("nota: "+nota + " ");
            total += nota;
        }
        System.out.println();
        System.out.printf("A média é %d",total / notas.length);

        }

}
