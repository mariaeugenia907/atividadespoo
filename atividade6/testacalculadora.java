	public class TestaCalculadora {
		public static void main(String[] args) {
			Calculadora calc = new Calculadora(6,2);
			System.out.println(calc.dividir());
			
			CalculadoraCientifica calcc = new CalculadoraCientifica(10, 4);
			
			System.out.println(calcc.exponenciar(3, 5));
			
			System.out.println(calcc.dividir());
			
			System.out.println(calcc.dividir(true));
			
		}
	}