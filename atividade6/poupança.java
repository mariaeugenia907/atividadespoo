
	public class Poupanca extends Conta {
		private double taxa;
			
		public void renderJuros() {
			
			double juro = getSaldo() * taxa/100;
			depositar(juro);
		}

		public Poupanca(String num, double valor, double taxa) {
			super(num, valor);
			this.taxa = taxa;
		}
	}