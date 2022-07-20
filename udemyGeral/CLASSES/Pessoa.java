package udemyGeral.CLASSES;

public class Pessoa {
    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    void comer(Comida x){
        if (x != null) {
            peso += x.peso;
        }
    }
}
