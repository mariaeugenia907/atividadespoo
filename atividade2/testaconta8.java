public class TestaConta {
public static void main(String[] args) {
	Conta c1 = new Conta ("1", 200);
    Conta c2 = new Conta ("2", 100);
	c1 = c2;
	c1. saque(10);
	c1.transferir (c2, 50);
	System.out.println(c1 . saldo);
	System.out.println(c2 . saldo);
	
}
}
