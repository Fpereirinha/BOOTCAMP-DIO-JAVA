package oo.composição.desafio;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList<Compra> client = new ArrayList<>();
    Cliente(String nome){
        this.nome = nome;
    }
    double obterValorTotal(){
        double total = 0;
        for (Compra compra :
                client) {
            total += compra.obterValorTotal();
        }


        return total;
    }
    void adicionarCompra(Compra compra){
        this.client.add(compra);
    }
}
