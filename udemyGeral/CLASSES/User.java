package udemyGeral.CLASSES;

public class User {
    String nome;
    String email;
    User(String nome, String email){
        this.email = email;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof User outro) {
            boolean nomeigual = outro.nome.equals(this.nome);
            boolean emailigual = outro.email.equals(this.email);
            return nomeigual && emailigual;
        }
        else{
            return false;
        }

    }
}
