package coleções;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<User> usuarios = new HashSet<>();
        usuarios.add(new User("Pedro"));
        usuarios.add(new User("João"));
        System.out.println(usuarios.contains(new User("João"))); // True
    }
}
