package udemyGeral.CLASSES;

public class AreaTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(2);
        System.out.println(a1.area());
        System.out.println(AreaCirc.area(2));
        System.out.println(AreaCirc.area(10));
    }
}
