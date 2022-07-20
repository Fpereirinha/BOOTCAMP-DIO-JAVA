package oo.composição;

import java.util.ArrayList;

public class compra {
    String cliente;
    ArrayList<produtos> itens = new ArrayList<>();
    void adicionar(produtos produto){
        itens.add(produto);
        produto.Compra = this;
    }
    double obtervalor(){
        double total = 0;
        for (produtos atual:
             itens) {
            total += atual.preco * atual.quantidade;
        }
        return total;
    }

}
