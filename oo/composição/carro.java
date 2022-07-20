package oo.composição;

public class carro {
    motor motor = new motor();
    void acelerar(){
        motor.fatorinject += 0.4;
    }
    void frear()
    {
        if (motor.giros() - .4 < 0){
            motor.fatorinject = 0;
        }else {
            motor.fatorinject -= .4;
        }
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
    boolean estaligado(){
        return motor.ligado;
    }
}
