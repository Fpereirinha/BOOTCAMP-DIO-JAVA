package udemyGeral.CLASSES;

public class valorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;
        a++;
        b--;
        System.out.printf("%.2f  %.2f\n",a,b);
        Data d1 = new Data(2,2,2222);
        Data d2 = d1;
        d1.dia = 12;
        d2.mes = 13;
        System.out.println(d1.datareturn());
        System.out.println(d2.datareturn());
        Default(d1);
        System.out.println(d2.datareturn());
        System.out.println(d1.datareturn());
        int c = 2;
        System.out.println(c);
        c = Plus(c);
        System.out.println(c);
    }

    static void Default(Data d){
        d.ano = 1;
        d.mes = 1;
        d.dia = 1;
    }
    static int Plus(int a){
        return ++a;
    }
}

