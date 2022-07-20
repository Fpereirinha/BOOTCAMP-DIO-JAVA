package udemyGeral.Fundamentos;

import javax.swing.*;

public class JOpdialog {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String n2 = JOptionPane.showInputDialog("Digite o segundo número");
        System.out.print("A soma dos números será: " + (Double.parseDouble(n1) + Double.parseDouble(n2)));
    }
}
