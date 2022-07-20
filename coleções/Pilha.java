package coleções;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Pequeno Principe"); // retorna true or false.
        livros.push("Livro2"); // retornará excessão caso não consiga adicionar por limitação de capacidade.
        livros.push("O hobbit");
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

    }
}
