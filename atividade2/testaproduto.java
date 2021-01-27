public class TestaProduto {
public static void main(String[] args) {
Produto x1 = new Produto(123, 20, 100, "biscoito");
x1.baixa(10);
x1.baixa(110);
x1.reposicao(30);
x1.reajustar(5);
System.out.println(x1.toString());
}
}
