public class Calculadora {
	
		private double op1;
		private double op2;
		
		public Calculadora(double op1, double op2) {
			this.op1 = op1;
			this.op2 = op2;
		}
		
		public double somar() {
			return op1 + op2;
		}
		
		public double dividir() {
			return op1/op2;
		}
	}