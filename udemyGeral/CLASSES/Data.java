package udemyGeral.CLASSES;

public class Data {
    int dia;
    int mes;
    int ano;
    Data(){
        this(2,2,1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String datareturn(){
        return String.format("%d/%d/%d",dia,mes,ano);
    }
}
