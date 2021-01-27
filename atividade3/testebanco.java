public class teste {
public static void main(String[] args) {
Banco banco = new Banco(2);
Conta c1 = new Conta("1", 200);
banco.inserir(c1);
Conta c2 = new Conta("2", 300);
banco.inserir(c2);
Conta c3 = new Conta("3", 600);
banco.inserir(c3);
banco.creditar("1", 200);
System.out.println(c1.saldo);
banco.creditar("7", 100);
banco.transferir("1", "7", 100);
banco.transferir("1", "2", 700);
System.out.println(c1.saldo);
System.out.println(c2.saldo);
banco.creditar("7", 100);
System.out.println("Contas cadastradas: " + banco.retornaQuantidade());
System.out.println("Total de valores: " + banco.retornaValorTotal());
System.out.println("Média de valores: " + banco.retornaMediaValores());
}
}