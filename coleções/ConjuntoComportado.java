package coleções;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // Set<String> listaaprovados = new HashSet<>();
        Set<String> listaAprovados = new LinkedHashSet<>();
        listaAprovados.add("Joao");
        listaAprovados.add("Pedro");
        listaAprovados.add("Jessica");
        listaAprovados.add("Flavio");
        listaAprovados.add("Amanda");
        for (String aprovados:listaAprovados
             ) {
            System.out.println(aprovados);
        }
        Set<Integer> numeros = new LinkedHashSet<>();
        //Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        for (int n :
                numeros) {
            System.out.println(n);
        }

    }
}

