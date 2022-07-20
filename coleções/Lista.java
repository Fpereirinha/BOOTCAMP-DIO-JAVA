package coleções;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<User> lista = new ArrayList<>();
        User u1 = new User("Pedro");
        lista.add(u1);
        lista.add(new User("João"));
        lista.add(new User("Carol"));
        lista.add(new User("Joana"));
        lista.add(new User("Klebert"));
        lista.add(new User("Michelle"));
        System.out.println(lista.remove(1).nome + " Esse foi removido.");
        System.out.println((lista.remove(new User("Michell"))) ? "Foi removido" : "Não foi removido.");
        System.out.println(lista.remove(new User("Michelle"))+ "<<<< foi ou não removido.");
        for (User u :
                lista) {
            System.out.println(u);
        }
        System.out.println(lista.get(0));
        System.out.println(lista.contains(new User("Michelle")));
        System.out.println(lista.contains(new User("Michell")));
    }
}
