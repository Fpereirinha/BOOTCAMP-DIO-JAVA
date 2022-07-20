package oo.composição;

public class carroTeste {
    public static void main(String[] args) {
        carro c = new carro();
        System.out.println(c.estaligado());
        c.ligar();
        System.out.println(c.estaligado());
        System.out.println(c.motor.giros());
        c.acelerar();
        System.out.println(c.motor.giros());
        c.desligar();
        System.out.println(c.motor.giros());
        c.ligar();
        System.out.println(c.motor.giros());
        c.frear();
        System.out.println(c.motor.giros());
        
    }
}
