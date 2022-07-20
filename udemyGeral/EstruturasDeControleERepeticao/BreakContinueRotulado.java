package udemyGeral.EstruturasDeControleERepeticao;

public class BreakContinueRotulado {
    public static void main(String[] args) {
        externo:
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 1) break externo; // continue...
                System.out.printf("%d %d ", i, j);
            }
        }
    }
}
