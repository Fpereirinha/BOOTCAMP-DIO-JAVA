package udemyGeral.CLASSES;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(2,6,2022);
        System.out.printf("Primeira data = %s",d1.datareturn());
        System.out.println();
        System.out.printf("Segunda data = %s",d2.datareturn());
    }
}
