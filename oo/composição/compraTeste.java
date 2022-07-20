package oo.composição;

public class compraTeste {
    public static void main(String[] args) {
        compra c1 = new compra();
        c1.cliente = "Pedro";
        c1.adicionar(new produtos("Papel", 2, 25));
        c1.adicionar(new produtos("Papel", 2, 25));
        c1.itens.add(new produtos("Papel", 2, 25));
        c1.itens.add(new produtos("Papel", 2, 25));
        System.out.println(c1.obtervalor());

    }

}
