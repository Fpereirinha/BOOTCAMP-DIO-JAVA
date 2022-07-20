package udemyGeral.CLASSES;

public class AreaCirc {
    double raio;
    final static double pi = 3.14;

    public AreaCirc(double raio) {
        this.raio = raio;
    }
    double area(){
        return (raio * raio) * pi;
    }
    static double area(double raio){
        return raio * raio * pi;
    }
}
