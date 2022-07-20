package udemyGeral.Fundamentos;

public class DesafioAritmetico {
    public static void main(String[] args) {
        double a = Math.pow(6 * (3 + 2), 2);
        double b = Math.pow((1 - 5) * (2 - 7), 2);
        double c = 3 * 2;
        double d = Math.pow(2, 2);
        double resposta = Math.pow((a / c) - (b / d), 3);
        double respostaf = resposta / Math.pow(10, 3);
        System.out.println(respostaf);
    }
}
