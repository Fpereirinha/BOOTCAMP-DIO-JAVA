package oo.composição.desafio;

import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<>();
    void adicionaritem(Produto produto, int qtd){
        this.itens.add(new Item(produto,qtd));
    }
    void adicionaritem(String nome, double preco, int qtd){
        this.itens.add(new Item(new Produto(nome,preco),qtd));
    }
    double obterValorTotal(){
        double total = 0;
        for (Item item :
                itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
