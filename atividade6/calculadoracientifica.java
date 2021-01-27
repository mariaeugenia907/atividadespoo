	public class CalculadoraCientifica extends Calculadora {

		public CalculadoraCientifica(double op1, double op2) {
			super(op1, op2);
		}

		
		public double exponenciar(double base, double expoente) {
			return Math.pow(base, expoente);
		}
		
		
		public double dividir(boolean arredonda) {
			double resultado = super.dividir();
			if (arredonda) {
				resultado = Math.round(resultado);
			}
			
			return resultado;
		}
	}