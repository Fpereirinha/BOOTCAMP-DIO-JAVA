package udemyGeral.CLASSES;
public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Ice",1200,.1);
        Produto p2 = new Produto("Alura",2000,.25);
        Produto p3 = new Produto("Oloco",2000);;
        System.out.printf("Preço original do produto 1 %.2f com desconto %.2f\n",p1.preco,p1.precodesc());
        System.out.printf("Preço original do produto 2 %.2f com desconto %.2f\n",p2.preco,p2.precodesc());
        System.out.println(p3.precodesc());
        System.out.println(Produto.desconto);
    }

}
