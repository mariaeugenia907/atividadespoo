public class Conta {
	public static void main(String[] args) {
		String numero;
		double saldo;
	}
	double saldo;
	private String numero;
	Conta(String numero, double v){
		this.saldo = v;
		this.numero = numero;
	}
	boolean sacar(double v) {
		if(saldo - v < 0);{
		return false;
	} else {
		saldo=saldo - v;
		return true;
	}
	}
		 void depositar (double v) {
			saldo = saldo + v;
		}
		double consultasaldo() {
			return saldo;
		}
		boolean transferir (Conta d, double v) {
		if (this.saque(v) == false) {
		return false;
		} else {
			(this.saque(double v))
			d.depositar(v);
			}
		
			return true;
		}
		public void saque(double v) {
			// TODO Auto-generated method stub
			
		}
	}

