package dioexercicios;

public class emprestimo {
    public static void emprestimoo(float valor, float parcela){
        if (parcela == 1) {
            float total = valor + (valor * 0.15f);
            System.out.println("Valor total após o emprestimo: R$" +total);
        } else if (parcela == 2){
            float total = valor + (valor * .25f);
            System.out.println("Valor total após o emprestimo: R$" +total);
        } else{
            System.out.println("Valor de parcelas inaceitavel.");
        }
    }
}
