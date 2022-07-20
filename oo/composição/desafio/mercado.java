package oo.composição.desafio;

public class mercado {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pedro");
        Compra compra1 = new Compra();
        compra1.adicionaritem("Pão", 22,3);
        compra1.adicionaritem(new Produto("Lasanha", 22),2);
        c1.adicionarCompra(compra1);
        System.out.println(c1.obterValorTotal());

    }
}
