package oo.composição;

public class motor {
    double fatorinject = 1;
    boolean ligado = false;
    int giros(){
        if (!ligado){
            return 0;
        }else{
        return (int) Math.round(fatorinject * 3000);
         }
    }
}
