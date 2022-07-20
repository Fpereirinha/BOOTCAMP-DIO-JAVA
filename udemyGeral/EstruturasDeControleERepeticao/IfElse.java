package udemyGeral.EstruturasDeControleERepeticao;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número");
        int valn = Integer.parseInt(valor);
        if (valn % 2 == 0) System.out.println("Número digitado par !");
        else System.out.println("Número digitado impar !");
    }
}
