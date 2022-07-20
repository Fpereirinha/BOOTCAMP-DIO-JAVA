package coleções;

import java.util.Objects;

public class User {
    String nome;
    User(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Meu nome é %s.", this.nome);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nome, user.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
