public class Conta {
	private String num;
	private double saldo;
	
	public Conta(String num, double valor) {		
		this.num = num;
		this.saldo = valor;
	}

	public void saca(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void transferir(Conta destino, double valor) {
		this.saca(valor);
		destino.depositar(valor);
	}

	public String getNumero() {
		return num;
	}

}

