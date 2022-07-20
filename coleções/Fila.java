package coleções;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); // caso atinja o limite, retornará erro.
        fila.offer("Bia"); // offer para limitações de lista. // retornará resultados true ou false.
        fila.offer("Pedro");
        fila.offer("João");
        fila.offer("Guilherme");
        System.out.println(fila.peek()); // diferença quando a lista está vázia, aqui retornará null (nulo)
        System.out.println(fila.element()); // retornará uma excessão, erro.
/*        fila.isEmpty();
        fila.clear();
        fila.size();
        fila.contains();*/
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // retorná o valor e o retira da lista, caso fique vazia retornará null.
        //fila.remove(); retornará uma excessão caso não houver mais valores.

    }
}
