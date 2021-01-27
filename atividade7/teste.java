public class Teste {

	public static void main(String[] args) {
		try {
			int[] numeros = new int[5];
	
			for (int i = 0; i  10; i++) {
				numeros[i] = i;
			}
			System.out.println(Nao chegará);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(O array ultrapassou 4);
		} finally {
			System.out.println(exceção que passa);
		}
		
		try {
			Conta c = null;
			System.out.println(Err +  c.getNumero());
		} catch (Exception e) {
			System.out.println(Class não instanciada);
		}
}}