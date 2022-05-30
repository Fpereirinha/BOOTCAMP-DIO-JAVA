package udemyGeral;

public class DesafiosLogicos {
    public static void main(String[] args) {
        // trabalho terça (V / F)
        // trabalho quinta (V / F)
        boolean trab1 = false;
        boolean trab2 = true;
        boolean tv50 = trab1 && trab2;
        boolean tv25 = trab1 ^ trab2;
        boolean sorvete = trab1 || trab2;
        System.out.println("Comprou tv 50 ?" + tv50);
        System.out.println("Comprou tv 25 ?" + tv25);
        System.out.println("Tomou sorvete ?" + sorvete);


    }
}
