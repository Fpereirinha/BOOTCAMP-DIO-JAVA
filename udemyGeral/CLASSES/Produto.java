package udemyGeral.CLASSES;


public class Produto {
    String nome;
    double preco;
    static double desconto = .25;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        Produto.desconto = desconto;
    }

    double precodesc(){
        return preco * (1- desconto);
    }
}
