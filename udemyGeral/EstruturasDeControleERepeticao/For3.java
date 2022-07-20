package udemyGeral.EstruturasDeControleERepeticao;

public class For3 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%d x %d = %d\n", (i+1), (j+1), ((j+1) * (i+1)));
            }
            System.out.println("*************");
        }
    }
}
