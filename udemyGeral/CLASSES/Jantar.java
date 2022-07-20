package udemyGeral.CLASSES;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Feijão", .300);
        Comida c2 = new Comida("Bife", .400);
        Pessoa p1 = new Pessoa("Pedro", 85);
        Pessoa p2 = new Pessoa("Gabriel", 55);
        System.out.println(p1.peso);
        System.out.println(p2.peso);
        p1.comer(c2);
        p2.comer(c1);
        System.out.println(p2.peso);
        System.out.println(p1.peso);
        p1.comer(c1);
        p2.comer(c2);
        System.out.println(p2.peso);
        System.out.println(p1.peso);
    }

}
